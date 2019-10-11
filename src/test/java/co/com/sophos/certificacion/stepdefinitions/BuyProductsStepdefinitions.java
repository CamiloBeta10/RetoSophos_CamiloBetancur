package co.com.sophos.certificacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.sophos.certificacion.models.UserData;
import co.com.sophos.certificacion.questions.TheProduct;
import co.com.sophos.certificacion.task.AddProduct;
import co.com.sophos.certificacion.task.Start;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuyProductsStepdefinitions {

	@Managed(driver = "chrome")
	private WebDriver driver;
	Actor sophos = Actor.named("sophos");

	@Before
	public void setup() {
		sophos.can(BrowseTheWeb.with(driver));
	}

	@Given("^You enter the page of Metro$")
	public void youEnterThePageOfMetro() {
		sophos.wasAbleTo(Start.thePage());
	}

	@When("^he selects a product$")
	public void heSelectsAProduct(List<UserData> data) {
		sophos.attemptsTo(AddProduct.toCart(data));
	}

	@Then("^he verifies which shopping cart$")
	public void heVerifiesWhichShoppingCart() {
		sophos.should(seeThat(TheProduct.inTheCart()));
	}

}
