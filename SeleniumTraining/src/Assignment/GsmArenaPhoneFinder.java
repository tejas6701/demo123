package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhoneFinder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> elements=driver.findElements(By.cssSelector(".brandmenu-v2>ul>*"));
		System.out.println("Phone Names Count:- "+elements.size());
		for(int i=0;i<elements.size();i++) {
			WebElement phoneOptions=elements.get(i);
			String phoneNames=phoneOptions.getText();
			System.out.println(phoneNames);
		}driver.close();
	}

}
