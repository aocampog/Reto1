package co.com.hospital.screenplay.tasks;

import java.util.List;

import co.com.hospital.screenplay.model.DatosPersonales;
import co.com.hospital.screenplay.ui.HospitalSitePage;
import co.com.hospital.screenplay.tasks.Apoyo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RealizarRegistro implements Task{
	
	private List<DatosPersonales> datosPersonales;
	
	public RealizarRegistro(List<DatosPersonales> datosPersonales) {
		this.datosPersonales=datosPersonales;
	}

	@Override
	public <T extends Actor> void performAs(T actor){
		
		if(datosPersonales.get(0).getRegistro().equals("doctor")) {
			actor.attemptsTo(Click.on(HospitalSitePage.OPCION_AGREGAR_DOCTOR));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getNombreCompleto()).into(HospitalSitePage.TEXTO_NOMBRE_COMPLETO_DOCTOR));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getApellidos()).into(HospitalSitePage.TEXTO_APELLIDOS_DOCTOR));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getTelefono()).into(HospitalSitePage.TEXTO_TELEFONO_DOCTOR));
//			actor.attemptsTo(Enter.theValue(Apoyo.cedulaAleatoria(datosPersonales.get(0).getDocumentoDeIdentidad())).into(HospitalSitePage.TEXTO_NUMERO_DOCUMENTO_DOCTOR));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getDocumentoDeIdentidad()).into(HospitalSitePage.TEXTO_NUMERO_DOCUMENTO_DOCTOR));
			actor.attemptsTo(Click.on(HospitalSitePage.BOTON_GUARDAR_DOCTOR));
		} else if(datosPersonales.get(0).getRegistro().equals("paciente")) {
			actor.attemptsTo(Click.on(HospitalSitePage.OPCION_AGREGAR_PACIENTE));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getNombreCompleto()).into(HospitalSitePage.TEXTO_NOMBRE_COMPLETO_PACIENTE));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getApellidos()).into(HospitalSitePage.TEXTO_APELLIDOS_PACIENTE));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getTelefono()).into(HospitalSitePage.TEXTO_TELEFONO_PACIENTE));
//			actor.attemptsTo(Enter.theValue(Apoyo.cedulaAleatoria(datosPersonales.get(0).getDocumentoDeIdentidad())).into(HospitalSitePage.TEXTO_NUMERO_DOCUMENTO_PACIENTE));
			actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getDocumentoDeIdentidad()).into(HospitalSitePage.TEXTO_NUMERO_DOCUMENTO_PACIENTE));
			actor.attemptsTo(Click.on(HospitalSitePage.BOTON_GUARDAR_DOCTOR));
		}
		
	}

	public static Performable IngresoInformacion(List<DatosPersonales> datosPersonales) {
		return Tasks.instrumented(RealizarRegistro.class,datosPersonales);
	}
	
	
}
