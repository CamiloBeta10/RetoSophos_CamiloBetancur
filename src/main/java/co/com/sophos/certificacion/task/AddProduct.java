package co.com.sophos.certificacion.task;

import static co.com.sophos.certificacion.userpage.NavigationPage.BTN_ADD_TO_CARD;
import static co.com.sophos.certificacion.userpage.NavigationPage.BTN_SEE_CART;
import static co.com.sophos.certificacion.userpage.NavigationPage.PRICE_LABEL;
import static co.com.sophos.certificacion.userpage.NavigationPage.PRODUCT;
import static co.com.sophos.certificacion.userpage.NavigationPage.SEARCH_BAR;

import java.util.List;



import co.com.sophos.certificacion.models.UserData;
import co.com.sophos.certificacion.userpage.NavigationPage;
import co.com.sophos.certificacion.utils.others.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;



public class AddProduct implements Task {
	
	private List<UserData> data;

	public AddProduct(List<UserData> data) {
		this.data = data;
	}


	public static AddProduct toCart(List<UserData> data) {
		return Tasks.instrumented(AddProduct.class, data);
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
			   Wait.theNext(5),
				Click.on(SEARCH_BAR),
				Enter.theValue(data.get(0).getProduct()).into(SEARCH_BAR),
				Click.on(PRODUCT),
				Scroll.to( PRICE_LABEL),
				Wait.theNext(5),
				Click.on(BTN_ADD_TO_CARD),
				Wait.theNext(2),
				Click.on(NavigationPage.BTN_CART),
				Wait.theNext(2),
				Click.on(BTN_SEE_CART)
				);
		actor.remember("product", data.get(0).getProduct());
		
	}

}
