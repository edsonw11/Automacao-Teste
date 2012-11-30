import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWorld {
	private WebDriver driver;
	private final StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.http.phishy-userpass-length", 255);
		profile.setPreference("network.automatic-ntlm-auth.trusteduris", "http://localhost:8080/MockSelenium/");
		// driver = new FirefoxDriver(profile);
		driver = new InternetExplorerDriver();
		//driver = new OperaDriver();
		// driver = new SafariDriver();

		driver.get("http://i500334:teste06@localhost:8080/MockSelenium/presHome.jsf");

	}

	@Test
	public void testeRecurso() throws Exception {

		driver.findElement(By.linkText("Recursos")).click();
		driver.findElement(By.linkText("Consultar Recursos")).click();

		driver.findElement(By.xpath("(//input[@name='formConsultarRecursos:tipoConsulta'])[2]")).click();

		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).clear();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).sendKeys("RECURSO");

		driver.findElement(By.id("formConsultarRecursos:lupaPesquisarRecurso")).click();

		driver.findElement(By.xpath("(//input[@name='itemSelecionadoListaRecurso'])[5]")).click();
		driver.findElement(By.id("formConsultarRecursos:btDetalhar")).click();
		driver.findElement(By.id("formConsultarRecursos:btHideDetalhe")).click();

		driver.findElement(By.cssSelector("img[title=\"Pr—ximas\"]")).click();
		driver.findElement(By.cssSelector("img[title=\"òltima\"]")).click();

		driver.findElement(By.xpath("(//input[@name='itemSelecionadoListaRecurso'])[9]")).click();
		driver.findElement(By.id("formConsultarRecursos:btDetalhar")).click();
		driver.findElement(By.id("formConsultarRecursos:btHideDetalhe")).click();
		driver.findElement(By.cssSelector("img[title=\"Primeira\"]")).click();
		driver.findElement(By.cssSelector("img[title=\"òltima\"]")).click();
		driver.findElement(By.cssSelector("img[title=\"Primeira\"]")).click();
		driver.findElement(By.cssSelector("img[title=\"òltima\"]")).click();
		driver.findElement(By.xpath("(//input[@name='itemSelecionadoListaRecurso'])[6]")).click();
		driver.findElement(By.id("formConsultarRecursos:btDetalhar")).click();
		driver.findElement(By.id("formConsultarRecursos:btHideDetalhe")).click();

	}

	@Test
	public void validaCampoRecursoNull() throws InterruptedException {
		driver.findElement(By.linkText("Recursos")).click();
		driver.findElement(By.linkText("Consultar Recursos")).click();

		driver.findElement(By.xpath("(//input[@name='formConsultarRecursos:tipoConsulta'])[2]")).click();

		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).clear();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).sendKeys("");
		driver.findElement(By.id("formConsultarRecursos:lupaPesquisarRecurso")).click();

		assertEquals(true, driver.getPageSource().contains("O campo \"Recursos\" Ž obrigat—rio!"));

		driver.findElement(By.id("formModalMessages:okButtonId")).click();

	}

	@Test
	public void testePaginacao() {
		driver.findElement(By.linkText("Recursos")).click();
		driver.findElement(By.linkText("Consultar Recursos")).click();

		driver.findElement(By.xpath("(//input[@name='formConsultarRecursos:tipoConsulta'])[2]")).click();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).clear();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).sendKeys("RECURSO");
		driver.findElement(By.id("formConsultarRecursos:lupaPesquisarRecurso")).click();

		for (int i = 2; i < 50; i++) {
			paginacao("RECURSO (fwop)" + i);
			driver.findElement(By.cssSelector("img[title=\"Pr—ximas\"]")).click();
			i += 10;
		}

		for (int i = 50; i > 2; i--) {
			paginacao("RECURSO (fwop)" + i);
			driver.findElement(By.cssSelector("img[title=\"Anteriores\"]")).click();
			i -= 10;
		}

	}

	/**
	 * 
	 */
	private void paginacao(String recurso) {

		assertEquals(true,
				new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(By.id("formConsultarRecursos:tabelaRecurso"), recurso)));

	}

	@After
	public void tearDown() throws Exception {

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
		driver.quit();
	}

}