package WebDriverManagerSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerSetupForChrome {

	public static void main(String[] args) {
//		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
//		//step1: set driver executable path by using System.setProperty(String key,String value)
//		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}

}
