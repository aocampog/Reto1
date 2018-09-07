package co.com.orangehrm.screenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;

import static co.com.orangehrm.screenplay.util.UtilidadTiempo.condicionExitosa;

public class Esperar implements Interaction {
	
	private Integer espera;
	
	public Esperar(Integer espera) {
		this.espera=espera;
	}
	
    @Override
    public <T extends Actor> void performAs(T actor) {
    	try {
    		Awaitility.await().forever().pollInterval(espera*1000, TimeUnit.MILLISECONDS).until(condicionExitosa());
    	} catch (Exception e) {
    		e.getMessage();
	   }

    }

    public static Esperar aMoment(Integer espera) {
    	return instrumented(Esperar.class,espera);
    }


}
