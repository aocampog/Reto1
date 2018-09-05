package co.com.automationdemo.screenplay.tasks;

import co.com.automationdemo.screenplay.ui.AutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private AutomationDemoSitePage automationDemoSite; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(automationDemoSite));
	}

	public static Abrir LaPaginaWeb() {
		return Tasks.instrumented(Abrir.class);
	}

}
