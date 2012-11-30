
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;





public class webDRIVER extends SeleneseTestCase {
	
	private static WebDriver driver = new FirefoxDriver();
	private static String baseUrl = "http://localhost:8080/";
	private static Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
	
	public static void main(String[] args) {
		testWebDRIVER();;
	}

	public static void testWebDRIVER(){
		selenium.open("/MockSelenium/gestor.gestaomodelo.consultarrecursos.jsf");
		selenium.click("link=Recursos");
		selenium.click("id=_id198");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@name='formConsultarRecursos:tipoConsulta'])[2]");
		selenium.type("id=formConsultarRecursos:nomeRecurso", "Caelum");
		selenium.click("id=formConsultarRecursos:lupaPesquisarRecurso");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@name='itemSelecionadoListaRecurso'])[2]");
		selenium.click("id=formConsultarRecursos:btDetalhar");
		selenium.click("id=formConsultarRecursos:btHideDetalhe");
		selenium.stop();
	}

}
