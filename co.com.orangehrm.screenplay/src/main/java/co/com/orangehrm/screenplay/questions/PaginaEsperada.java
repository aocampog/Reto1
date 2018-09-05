package co.com.orangehrm.screenplay.questions;

import co.com.orangehrm.screenplay.questions.PaginaEsperada;
import co.com.orangehrm.screenplay.ui.OrangeHrmSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaginaEsperada implements Question<String>{

	public static PaginaEsperada es() {
		return new PaginaEsperada();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(OrangeHrmSitePage.NOMBRE_USUARIO).viewedBy(actor).asString();
	}

}
