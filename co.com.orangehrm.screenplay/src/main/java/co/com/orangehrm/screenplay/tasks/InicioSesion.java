package co.com.orangehrm.screenplay.tasks;

import co.com.orangehrm.screenplay.ui.OrangeHrmSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InicioSesion implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Click.on(OrangeHrmSitePage.BOTON_LOGIN));
	}
	
	public static InicioSesion IniciarSesion() {
		return Tasks.instrumented(InicioSesion.class);
	}

}
