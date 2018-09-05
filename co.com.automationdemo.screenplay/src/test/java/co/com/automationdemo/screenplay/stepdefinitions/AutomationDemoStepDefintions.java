package co.com.automationdemo.screenplay.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.automationdemo.screenplay.model.DatosPersonales;
import co.com.automationdemo.screenplay.questions.PaginaEsperada;
import co.com.automationdemo.screenplay.tasks.Abrir;
import co.com.automationdemo.screenplay.tasks.RealizarRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AutomationDemoStepDefintions {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaWeb());
	}


	@Cuando("^el realiza el registro en la página$")
	public void elRealizaElRegistroEnLaPágina(List<DatosPersonales> datosPersonales) throws Exception {
		carlos.attemptsTo(RealizarRegistro.IngresoInformacion(datosPersonales));
	}

	@Entonces("^el verifica que se carga la pantalla con texto  (.*)$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String fraseEsperada) throws Exception {
		carlos.should(seeThat(PaginaEsperada.es(), equalTo(fraseEsperada)));
	}

}
