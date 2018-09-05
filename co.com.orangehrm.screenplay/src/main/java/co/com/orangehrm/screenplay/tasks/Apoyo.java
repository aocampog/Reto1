package co.com.orangehrm.screenplay.tasks;

public class Apoyo {
	
	public static void pausa(int tiempo) {
		try {
			Thread.sleep(1000 * tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
