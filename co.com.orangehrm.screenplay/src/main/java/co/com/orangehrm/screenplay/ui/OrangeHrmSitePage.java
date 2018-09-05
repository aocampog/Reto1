package co.com.orangehrm.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHrmSitePage extends PageObject{
	
	public static final Target TEXTO_USUARIO = Target.the("Usuario").located(By.xpath("//INPUT[@id='txtUsername']"));
	public static final Target TEXTO_CONTRASENIA = Target.the("Contrasenia").located(By.xpath("//INPUT[@id='txtPassword']"));
	public static final Target BOTON_LOGIN = Target.the("Ingreso pagina").located(By.xpath("//INPUT[@id='btnLogin']"));
	public static final Target MENU_PIM = Target.the("MENU PIM").located(By.id("menu_pim_viewPimModule"));
	public static final Target MENU_AGREGAR_USUARIO = Target.the("Agregar usuario").located(By.id("menu_pim_addEmployee"));
	public static final Target TEXTO_PRIMER_NOMBRE = Target.the("Primer nombre").locatedBy("//INPUT[@id='firstName']");
	public static final Target TEXTO_SEGUNDO_NOMBRE = Target.the("Segundo nombre").located(By.xpath("//INPUT[@id='middleName']"));
	public static final Target TEXTO_APELLIDO = Target.the("Apellido").located(By.xpath("//INPUT[@id='lastName']"));
	public static final Target SELECT_UBICACION = Target.the("Ubicación").located(By.id("location_inputfileddiv"));
	public static final Target SELECT_BRITISH = Target.the("British").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Australia'])[1]/following::span[1]"));
	public static final Target BOTON_GUARDAR = Target.the("Boton Guardar").located(By.xpath("//A[@id='systemUserSaveBtn']"));
	public static final Target TEXTO_FECHA_NACIMIENTO= Target.the("Fecha de nacimiento").located(By.xpath("//INPUT[@id='date_of_birth']"));
	public static final Target SELECT_ESTADO_CIVIL = Target.the("Estado civil").located(By.xpath("//*[@id=\"marital_status_inputfileddiv\"]/div"));
	public static final Target SELECT_CIVIL_STATUS = Target.the("Selección Estado civil").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Married'])[1]/following::span[1]"));
	public static final Target CHECK_GENERO = Target.the("Genero").located(By.xpath("//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[3]/div/sf-decorator[3]/div/ul/li[1]/label"));
	public static final Target SELECT_NACIONALIDAD = Target.the("Nacionalidad").located(By.xpath("//*[@id=\"nationality_inputfileddiv\"]/div"));
	public static final Target SELECT_PAIS = Target.the("Nacionalidad ").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Colombian'])[1]/following::span[1]"));
	public static final Target TEXTO_LICENCIA_CONDUCCION = Target.the("Licencia de conducción").located(By.xpath("//INPUT[@id='driver_license']"));
	public static final Target TEXTO_FECHA_VENCIMIENTO_LICENCIA = Target.the("Fecha de vencimiento licencia").located(By.xpath("//INPUT[@id='license_expiry_date']"));
	public static final Target TEXTO_NICKNAME = Target.the("Nickname").located(By.xpath("//INPUT[@id='nickName']"));
	public static final Target TEXTO_SERVICIO_MILITAR = Target.the("Servicio militar").located(By.xpath("//INPUT[@id='militaryService']"));
	public static final Target BOTON_GUARDAR_DETALLE_PERSONA = Target.the("Guardar detalles personales").located(By.xpath("//BUTTON[@type='submit'][text()='Save']"));
	public static final Target SELECT_TIPO_SANGRE = Target.the("Tipo Sangre").located(By.xpath("//*[@id=\"1_inputfileddiv\"]/div"));
	public static final Target SELECT_A = Target.the("TIPO_A").located(By.xpath("//SPAN[text()='A']"));
	public static final Target TEXTO_HOBBIES = Target.the("Hobbies").located(By.xpath("//INPUT[@id='5']")); 
	public static final Target BOTON_GUARDAR_IMPORTANTE = Target.the("Guardar Importante").located(By.xpath("(//button[@type='submit'])[2]"));
	
	public static final Target MENU_LISTA_EMPLEADO = Target.the("Lista de empleados").located(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")); //By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	public static final Target TEXTO_BUSCAR = Target.the("Cuadro de búsqueda").located(By.xpath("//*[@id=\"employee_name_quick_filter_employee_list_value\"]"));
	public static final Target BOTON_BUSCAR = Target.the("Botón de buscar").located(By.xpath("//I[@id='quick_search_icon']"));
	public static final Target NOMBRE_USUARIO = Target.the("Nombre de usuario").located(By.xpath("//*[@id=\"employeeListTable\"]/tbody/tr/td[3]"));
}