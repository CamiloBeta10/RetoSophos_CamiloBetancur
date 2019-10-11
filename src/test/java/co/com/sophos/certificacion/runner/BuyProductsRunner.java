package co.com.sophos.certificacion.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import co.com.sophos.certificacion.utils.exceldata.BeforeSuite;
import co.com.sophos.certificacion.utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
		features = "src/test/resources/co/com/sophos/certificacion/feature/buy_products.feature",
		glue = "co.com.sophos.certificacion.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class BuyProductsRunner {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
	    DataToFeature.overrideFeatureFiles("./src/test/resources/co/com/sophos/certificacion/feature/buy_products.feature");
	}
	
}
	