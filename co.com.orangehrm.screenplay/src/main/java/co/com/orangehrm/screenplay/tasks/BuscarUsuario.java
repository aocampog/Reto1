package co.com.orangehrm.screenplay.tasks;

import co.com.orangehrm.screenplay.ui.OrangeHrmSitePage;

import java.util.List;

import co.com.orangehrm.screenplay.interactions.Esperar;
import co.com.orangehrm.screenplay.model.PaginaValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarUsuario implements Task {
	
	private List<PaginaValidacion> paginaValidacion;
	
	public BuscarUsuario(List<PaginaValidacion> paginaValidacion) {
		this.paginaValidacion=paginaValidacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OrangeHrmSitePage.MENU_LISTA_EMPLEADO));
		actor.attemptsTo(Enter.theValue(paginaValidacion.get(0).getPrimerNombre()).into(OrangeHrmSitePage.TEXTO_BUSCAR));
		actor.attemptsTo(Click.on(OrangeHrmSitePage.BOTON_BUSCAR));
		actor.attemptsTo(Esperar.aMoment(10));
	}

	public static BuscarUsuario BuscarElUsuario(List<PaginaValidacion> paginaValidacion) {
		return Tasks.instrumented(BuscarUsuario.class,paginaValidacion);
	}

}
