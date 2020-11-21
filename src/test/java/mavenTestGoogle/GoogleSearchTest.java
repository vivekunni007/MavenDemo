package mavenTestGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	
	@Test
	public void GSearch(){
	String exePath1 = "E:\\Softwares\\Selenium\\chromedriver\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exePath1);
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
		//hello
	}
}


