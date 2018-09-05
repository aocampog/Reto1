package co.com.orangehrm.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/orangehrm.feature",
		tags= "@PrimeraHistoria",
		glue="co.com.orangehrm.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class RunnerTags {

}
