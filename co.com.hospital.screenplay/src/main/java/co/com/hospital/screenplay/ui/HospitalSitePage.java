package co.com.hospital.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HospitalSitePage extends PageObject{
	
	//Información del doctor
	public static final Target OPCION_AGREGAR_DOCTOR = Target.the("Opción de agregar doctor").located(By.linkText("Agregar Doctor"));
	public static final Target TEXTO_NOMBRE_COMPLETO_DOCTOR = Target.the("Nombre completo doctor").located(By.id("name"));
	public static final Target TEXTO_APELLIDOS_DOCTOR = Target.the("Apellidos doctor").located(By.id("last_name"));
	public static final Target TEXTO_TELEFONO_DOCTOR = Target.the("Telefono doctor").located(By.id("telephone"));
	public static final Target TEXTO_NUMERO_DOCUMENTO_DOCTOR = Target.the("Numero documento doctor").located(By.id("identification"));
	public static final Target BOTON_GUARDAR_DOCTOR = Target.the("Guardar doctor").located(By.xpath("//A[@onclick='submitForm()'][text()='Guardar']"));
	
	public static final Target OPCION_AGREGAR_PACIENTE=Target.the("Opción de agregar paciente").located(By.linkText("Agregar Paciente"));;
	public static final Target TEXTO_NOMBRE_COMPLETO_PACIENTE = Target.the("Nombre completo paciente").located(By.name("name"));;
	public static final Target TEXTO_APELLIDOS_PACIENTE = Target.the("Apellidos paciente").located(By.name("last_name"));
	public static final Target TEXTO_TELEFONO_PACIENTE = Target.the("Telefono paciente").located(By.name("telephone"));
	public static final Target TEXTO_NUMERO_DOCUMENTO_PACIENTE = Target.the("Numero documento paciente").located(By.name("identification"));
	public static final Target BOTON_GUARDAR_PACIENTE =  Target.the("Guardar paciente").located(By.xpath("//A[@onclick='submitForm()'][text()='Guardar']"));
	
	public static final Target OPCION_AGENDAR_CITA=Target.the("Opción de agendar cita").located(By.linkText("Agendar Cita"));
	public static final Target TEXTO_DIA_CITA = Target.the("Día de la cita").located(By.id("datepicker"));
	public static final Target TEXTO_DOCUMENTO_PACIENTE = Target.the("Documento del paciente").located(By.xpath("(//INPUT[@type='text'])[2]"));
	public static final Target TEXTO_DOCUMENTO_DOCTOR = Target.the("Documento del paciente").located(By.xpath("(//INPUT[@type='text'])[3]"));
	public static final Target TEXTO_OBSERVACIONES = Target.the("Observaciones").located(By.xpath("//TEXTAREA[@class='form-control']"));
	public static final Target BOTON_GUARDAR_CITA = Target.the("Guardar cita").located(org.openqa.selenium.By.xpath("//A[@onclick='submitForm()'][text()='Guardar']"));
	
	public static final Target TEXTO_VERIFICACION = Target.the("Verificar creación doctor/paciente").located(By.className("panel-body"));
}