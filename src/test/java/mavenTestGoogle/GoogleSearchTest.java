package mavenTestGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	@Test
	public void GSearch(){
	String exePath1 = "E:\\Softwares\\Selenium\\geckodriver\\geckodriver.exe";
	 System.setProperty("webdriver.gecko.driver", exePath1);
		WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
		//hello
	}
}


