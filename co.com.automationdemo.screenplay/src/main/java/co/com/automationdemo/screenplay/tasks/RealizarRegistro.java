package co.com.automationdemo.screenplay.tasks;

import java.util.List;

import co.com.automationdemo.screenplay.model.DatosPersonales;
import co.com.automationdemo.screenplay.ui.AutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RealizarRegistro implements Task{
	
	private List<DatosPersonales> datosPersonales = null;
	
	public RealizarRegistro(List<DatosPersonales> datosPersonales) {
		this.datosPersonales=datosPersonales;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getNombre()).into(AutomationDemoSitePage.TEXTO_NOMBRE));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getApellido()).into(AutomationDemoSitePage.TEXTO_APELLIDO));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getDireccion()).into(AutomationDemoSitePage.TEXTO_DIRECCION));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getEmail()).into(AutomationDemoSitePage.TEXTO_CORREO_ELECTRONICO));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getTelefono()).into(AutomationDemoSitePage.TEXTO_TELEFONO));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.CHECK_GENERO));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.CHECK_HOBBIES_MOVIES));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.LISTA_IDIOMAS));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.SELECT_IDIOMA));
		actor.attemptsTo(SelectFromOptions.byValue(datosPersonales.get(0).getHabilidades()).from(AutomationDemoSitePage.LISTA_SKILLS));
		actor.attemptsTo(SelectFromOptions.byValue(datosPersonales.get(0).getPais()).from(AutomationDemoSitePage.LISTA_PAISES));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.SELECCION_PAIS));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getPais2()).into(AutomationDemoSitePage.INGRESO_PAIS));
		actor.attemptsTo(SelectFromOptions.byValue(datosPersonales.get(0).getAnio()).from(AutomationDemoSitePage.SELECCION_ANIO));
		actor.attemptsTo(SelectFromOptions.byValue(datosPersonales.get(0).getMes()).from(AutomationDemoSitePage.SELECCION_MES));
		actor.attemptsTo(SelectFromOptions.byValue(datosPersonales.get(0).getDia()).from(AutomationDemoSitePage.SELECCION_DIA));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getContrasenia()).into(AutomationDemoSitePage.TEXTO_CONTRASENIA));
		actor.attemptsTo(Enter.theValue(datosPersonales.get(0).getContrasenia()).into(AutomationDemoSitePage.TEXTO_CONFIRMACION_CONTRASENIA));
		actor.attemptsTo(Click.on(AutomationDemoSitePage.BOTON_SUBMIT));
	}

	public static Performable IngresoInformacion(List<DatosPersonales> datosPersonales) {
		return Tasks.instrumented(RealizarRegistro.class,datosPersonales);
	}
}
