package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaSamsung {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".brandmenu-v2>ul>*:first-child")).click();
		List<WebElement> allMobiles=driver.findElements(By.cssSelector(".makers>ul>*"));
		System.out.println("Total Device Count:- "+allMobiles.size());
		for(int i=0;i<allMobiles.size();i++) {
			WebElement phones=allMobiles.get(i);
			String names=phones.getText();
			System.out.println(names);
		}
		
	}

}
