package co.com.hospital.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/hospital.feature",
		tags= "@Escenario1", 
		glue="co.com.hospital.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class RunnerTags {

}
