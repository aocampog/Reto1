package co.com.hospital.screenplay.questions;

import co.com.hospital.screenplay.questions.PaginaEsperada;
import co.com.hospital.screenplay.ui.HospitalSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaginaEsperada implements Question<String>{

	public static PaginaEsperada es() {
		return new PaginaEsperada();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HospitalSitePage.TEXTO_VERIFICACION).viewedBy(actor).asString();
	}

}
