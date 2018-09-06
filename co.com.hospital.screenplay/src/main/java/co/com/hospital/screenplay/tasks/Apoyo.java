package co.com.hospital.screenplay.tasks;

public class Apoyo {
	
	public static void pausa(int tiempo) {
		try {
			Thread.sleep(1000 * tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String cedulaAleatoria(String cedula) {
		Integer numeroRandom=(int) (Math.random()*100);
		Integer dctoDoctor= Integer.parseInt(cedula)+numeroRandom;
		return dctoDoctor.toString();
	}

}
