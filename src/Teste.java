import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Teste {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.com.br/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testE() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys("cae");
		driver.findElement(By.linkText("Recursos")).click();
		driver.findElement(By.id("_id56")).click();
		driver.findElement(By.xpath("(//input[@name='formConsultarRecursos:tipoConsulta'])[2]")).click();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).clear();
		driver.findElement(By.id("formConsultarRecursos:nomeRecurso")).sendKeys("caelum");
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
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
