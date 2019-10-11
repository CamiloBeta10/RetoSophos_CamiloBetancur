package co.com.sophos.certificacion.questions;

import static co.com.sophos.certificacion.userpage.NavigationPage.PRODUCT_IN_CART;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheProduct implements Question<Boolean> {



	public static TheProduct inTheCart() {
		return new TheProduct();
	};

	@Override
	public Boolean answeredBy(Actor actor) {
		
		boolean blnexistElement = false;
		if (PRODUCT_IN_CART.resolveFor(actor).isVisible()) {
		    blnexistElement = true;
		    assertThat(PRODUCT_IN_CART.getName(), Text.of(PRODUCT_IN_CART).viewedBy(actor).asString(), IsEqual.equalTo(actor.recall("product")));
		
		}
		return blnexistElement;
	}
}
