package co.com.automationdemo.screenplay.questions;

import co.com.automationdemo.screenplay.ui.AutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaginaEsperada implements Question<String>{

	public static PaginaEsperada es() {
		return new PaginaEsperada();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AutomationDemoSitePage.TEXTO_ESPERADO).viewedBy(actor).asString();
	}

}
