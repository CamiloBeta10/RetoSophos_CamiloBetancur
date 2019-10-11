package co.com.sophos.certificacion.userpage;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.metro.pe/")
public class NavigationPage extends PageObject {

	
	public static final Target SEARCH_BAR = Target.the("Search bar of the products")
			.located(By.xpath("//input[@id='search-autocomplete-input']"));
	
	public static final Target PRODUCT = Target.the("selected product")
			.located(By.xpath("//div[@class='product-item product-item--16857 gotten-product-item-data  product-item--search product-item--inline']//div[2]//a"));

	public static final Target PRICE_LABEL = Target.the("butto for add product to cart")
			.located(By.xpath("//div[@class='plugin-preco']//div//p//em//strong[text()='S/699.00']"));
	
	public static final Target BTN_ADD_TO_CARD = Target.the("butto for add product to cart")
			.located(By.xpath("//button[@class='product-add-to-cart product-add-to-cart--product-view btn red add-to-cart']"));
	
	public static final Target BTN_CART = Target.the("button cart")
			.located(By.xpath("//button[@class='btn red minicart__action--toggle-open food-site']"));
	
	public static final Target BTN_SEE_CART = Target.the("button he can go of the page cart")
			.located(By.xpath("(//a[@class='btn primary minicart__action minicart__action--buy'])[1]"));
	
	public static final Target PRODUCT_IN_CART = Target.the("product add to cart")
			.located(By.xpath("//div[@class='product-item__info']//a"));
	
}
