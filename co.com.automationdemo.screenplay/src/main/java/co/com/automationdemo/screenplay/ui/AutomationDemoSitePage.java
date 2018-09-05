package co.com.automationdemo.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoSitePage extends PageObject{
	
	public static final Target TEXTO_NOMBRE = Target.the("Nombre ").located(By.xpath("(//INPUT[@type='text'])[1]"));
	public static final Target TEXTO_APELLIDO = Target.the("Apellido").located(By.xpath("(//INPUT[@type='text'])[2]"));
	public static final Target TEXTO_DIRECCION = Target.the("Dirección").located(By.xpath("//TEXTAREA[@rows='3'][text()=' ']"));
	public static final Target TEXTO_CORREO_ELECTRONICO = Target.the("Correo Electrónico").located(By.xpath("//INPUT[@type='email']"));
	public static final Target TEXTO_TELEFONO = Target.the("Correo Electrónico").located(By.xpath("//INPUT[@type='tel']"));
	public static final Target CHECK_GENERO = Target.the("Genero").located(By.xpath("(//INPUT[@type='radio'])[1]"));
	public static final Target CHECK_HOBBIES_MOVIES = Target.the("Correo Electrónico").located(By.xpath("//INPUT[@id='checkbox2']"));
	public static final Target LISTA_IDIOMAS = Target.the("Lista de idiomas").located(By.xpath("//DIV[@id='msdd']"));
	public static final Target SELECT_IDIOMA = Target.the("Español").located(By.xpath("//A[@class='ui-corner-all'][text()='Spanish']"));
	public static final Target LISTA_SKILLS = Target.the("Lista de habilidades").located(By.xpath("//SELECT[@id='Skills']"));
	public static final Target LISTA_PAISES = Target.the("Lista de paises").located(By.xpath("//SELECT[@id='countries']"));
	public static final Target SELECCION_PAIS = Target.the("Selección de pais").located(By.xpath("//SPAN[@class='select2-selection select2-selection--single']"));
	public static final Target INGRESO_PAIS = Target.the("Ingreso pais").located(By.xpath("//INPUT[@class='select2-search__field']"));
	public static final Target INGRESO_PAIS1= Target.the("Ingreso pais").located(By.xpath("//INPUT[@class='select2-search__field']"));
	public static final Target SELECCION_ANIO = Target.the("Año nacimiento").located(By.xpath("//SELECT[@id='yearbox']"));
	public static final Target SELECCION_MES = Target.the("Mes nacimiento").located(By.xpath("(//SELECT[@type='text'])[4]"));
	public static final Target SELECCION_DIA = Target.the("Dia nacimiento").located(By.xpath("//SELECT[@id='daybox']"));
	public static final Target TEXTO_CONTRASENIA = Target.the("Contraseña").located(By.xpath("//INPUT[@id='firstpassword']"));
	public static final Target TEXTO_CONFIRMACION_CONTRASENIA = Target.the("Confirmación contraseña").located(By.xpath("//INPUT[@id='secondpassword']"));
	public static final Target BOTON_SUBMIT = Target.the("Botón Submit").located(By.xpath("//BUTTON[@id='submitbtn']"));
	public static final Target TEXTO_ESPERADO= Target.the("Elemento esperado").located(By.xpath("(//H4)[1]"));
}