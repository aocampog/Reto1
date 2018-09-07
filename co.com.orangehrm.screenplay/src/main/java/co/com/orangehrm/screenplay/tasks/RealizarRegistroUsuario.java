package co.com.orangehrm.screenplay.tasks;

import java.util.List;

import co.com.orangehrm.screenplay.interactions.Esperar;
import co.com.orangehrm.screenplay.model.DatosPersonalesUsuario;
import co.com.orangehrm.screenplay.ui.OrangeHrmSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RealizarRegistroUsuario implements Task{
	
	private List<DatosPersonalesUsuario> datosPersonales;
	
	public RealizarRegistroUsuario(List<DatosPersonalesUsuario> datosPersonales) {
		this.datosPersonales=datosPersonales;
	}

	@Override
	public <T extends Actor> void performAs(T actor){
		
		actor.attemptsTo(Click.on(OrangeHrmSitePage.MENU_PIM));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.MENU_AGREGAR_USUARIO));
		actor.attemptsTo(Esperar.aMoment(15));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getPrimerNombre()).into(OrangeHrmSitePage.TEXTO_PRIMER_NOMBRE));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getSegundoNombre()).into(OrangeHrmSitePage.TEXTO_SEGUNDO_NOMBRE));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getApellido()).into(OrangeHrmSitePage.TEXTO_APELLIDO));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_UBICACION));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_BRITISH));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.BOTON_GUARDAR));
		actor.attemptsTo(Esperar.aMoment(15));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getFechaNacimiento()).into(OrangeHrmSitePage.TEXTO_FECHA_NACIMIENTO));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_ESTADO_CIVIL));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_CIVIL_STATUS));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.CHECK_GENERO));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_NACIONALIDAD));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_PAIS));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getLicenciaConduccion()).into(OrangeHrmSitePage.TEXTO_LICENCIA_CONDUCCION));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getFechaVencimientoConduccion()).into(OrangeHrmSitePage.TEXTO_FECHA_VENCIMIENTO_LICENCIA));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getUsuario()).into(OrangeHrmSitePage.TEXTO_NICKNAME));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getServicioMilitar()).into(OrangeHrmSitePage.TEXTO_SERVICIO_MILITAR));
		//actor.attemptsTo(Click.on(OrangeHrmSitePage.BOTON_GUARDAR_DETALLE_PERSONA));
		
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_TIPO_SANGRE));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.SELECT_A));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getHobbies()).into(OrangeHrmSitePage.TEXTO_HOBBIES));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.BOTON_GUARDAR_IMPORTANTE));
		actor.attemptsTo(Esperar.aMoment(10));
		
		
	}

	public static Performable IngresoInformacion(List<DatosPersonalesUsuario> datosPersonales) {
		return Tasks.instrumented(RealizarRegistroUsuario.class,datosPersonales);
	}
	
	
}
