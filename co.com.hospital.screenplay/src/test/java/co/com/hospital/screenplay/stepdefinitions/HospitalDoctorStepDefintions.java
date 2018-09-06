package co.com.hospital.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.hospital.screenplay.questions.PaginaEsperada;
import co.com.hospital.screenplay.model.AgendamientoCita;
import co.com.hospital.screenplay.model.DatosPersonales;
import co.com.hospital.screenplay.tasks.Abrir;
import co.com.hospital.screenplay.tasks.AgendarCita;
import co.com.hospital.screenplay.tasks.RealizarRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HospitalDoctorStepDefintions {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Dado("^que Carlos necesita registrar un nuevo doctor$")
	public void queCarlosNecesitaRegistrarUnNuevoDoctor() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaWeb());
	}
	
	@Dado("^que Carlos necesita registrar un nuevo paciente$")
	public void queCarlosNecesitaRegistrarUnNuevoPaciente() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaWeb());
	}
	
	@Dado("^que Carlos necesita asistir al medico$")
	public void queCarlosNecesitaAsistirAlMedico() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaWeb());
	}
	
	@Cuando("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
	public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministraciónDeHospitales(List<DatosPersonales> datosPersonales) throws Exception {
		carlos.wasAbleTo(RealizarRegistro.IngresoInformacion(datosPersonales));
	}
	
	@Cuando("^el realiza el agendamiento de una Cita$")
	public void elRealizaElAgendamientoDeUnaCita(List<AgendamientoCita> agendamientoCita) throws Exception {
		carlos.wasAbleTo(AgendarCita.AgendamientoCita(agendamientoCita));
	}

	@Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
	public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String mensaje) throws Exception {
		carlos.should(seeThat(PaginaEsperada.es(), equalTo(mensaje)));
	}
}
