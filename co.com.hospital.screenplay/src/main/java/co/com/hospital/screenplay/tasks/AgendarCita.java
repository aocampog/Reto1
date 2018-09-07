package co.com.hospital.screenplay.tasks;

import java.util.List;
import co.com.hospital.screenplay.model.AgendamientoCita;
import co.com.hospital.screenplay.ui.HospitalSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgendarCita implements Task {
	
private List<AgendamientoCita> agendamientoCita;
	
	public AgendarCita(List<AgendamientoCita> agendamientoCita) {
		this.agendamientoCita=agendamientoCita;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HospitalSitePage.OPCION_AGENDAR_CITA));
		actor.attemptsTo(Enter.theValue(agendamientoCita.get(0).getDiaCita()).into(HospitalSitePage.TEXTO_DIA_CITA));
		actor.attemptsTo(Enter.theValue(agendamientoCita.get(0).getDocumentoPaciente()).into(HospitalSitePage.TEXTO_DOCUMENTO_PACIENTE));
		actor.attemptsTo(Enter.theValue(agendamientoCita.get(0).getDocumentoDoctor()).into(HospitalSitePage.TEXTO_DOCUMENTO_DOCTOR));
		actor.attemptsTo(Enter.theValue(agendamientoCita.get(0).getObservaciones()).into(HospitalSitePage.TEXTO_OBSERVACIONES));
		actor.attemptsTo(Click.on(HospitalSitePage.BOTON_GUARDAR_CITA));
	}
	
	public static Performable CitaMedica(List<AgendamientoCita> agendamientoCita) {
		return Tasks.instrumented(AgendarCita.class,agendamientoCita);
	}

}
