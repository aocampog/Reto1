package co.com.orangehrm.screenplay.tasks;

import co.com.orangehrm.screenplay.ui.OrangeHrmSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private OrangeHrmSitePage orangeHrmSite; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHrmSite));
	}

	public static Abrir LaPaginaWeb() {
		return Tasks.instrumented(Abrir.class);
	}

}
