import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcessoSite {

	@Test
	public void VotarCertificaoJavaNery() {

		for (int i = 0; i < 10; i++) {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.informaticon.com.br/j/");
			driver.findElement(By.xpath("(//input[@name='voteid'])[1]")).click();
			driver.findElement(By.name("task_button")).click();
			driver.quit();

		}

	}

}
