package co.com.hospital.screenplay.tasks;

import co.com.hospital.screenplay.ui.HospitalSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private HospitalSitePage hospitalSitePage; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(hospitalSitePage));
	}

	public static Abrir LaPaginaWeb() {
		return Tasks.instrumented(Abrir.class);
	}

}
