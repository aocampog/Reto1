package co.com.orangehrm.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.orangehrm.screenplay.questions.PaginaEsperada;
import co.com.orangehrm.screenplay.model.DatosPersonalesUsuario;
import co.com.orangehrm.screenplay.model.PaginaValidacion;
import co.com.orangehrm.screenplay.tasks.Abrir;
import co.com.orangehrm.screenplay.tasks.BuscarUsuario;
import co.com.orangehrm.screenplay.tasks.InicioSesion;
import co.com.orangehrm.screenplay.tasks.RealizarRegistroUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class OrangeHrmStepDefintions {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor juan = Actor.named("Juan");
	
	@Before
	public void configuracionInicial() {
		juan.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Dado("^que Juan necesita crear un empleado en el OrageHR$")
	public void queJuanNecesitaCrearUnEmpleadoEnElOrageHR() throws Exception {
		juan.wasAbleTo(Abrir.LaPaginaWeb());
		juan.wasAbleTo(InicioSesion.IniciarSesion());
	}

	@Cuando("^el realiza el ingreso del registro en la aplicacion$")
	public void elRealizaElIngresoDelRegistroEnLaAplicación(List<DatosPersonalesUsuario> datosPersonales) throws Exception {
		juan.wasAbleTo(RealizarRegistroUsuario.IngresoInformacion(datosPersonales));
	}

	@Entonces("^el visualiza el nuevo empleado en el aplicativo$")
	public void elVisualizaElNuevoEmpleadoEnElAplicativo(List<PaginaValidacion> paginaValidacion) throws Exception {
		juan.wasAbleTo(BuscarUsuario.BuscarElUsuario(paginaValidacion));
		String nombreCompleto=paginaValidacion.get(0).getPrimerNombre() + " " + paginaValidacion.get(0).getSegundoNombre() + " " + paginaValidacion.get(0).getApellido();
		juan.should(seeThat(PaginaEsperada.es(), equalTo(nombreCompleto )));
	}	
}
