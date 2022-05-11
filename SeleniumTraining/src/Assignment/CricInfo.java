package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> menuList=driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>*"));
		System.out.println(menuList.size());
		for(int i=0;i<menuList.size();i++) {
			WebElement menu=menuList.get(i);
			String names=menu.getText();
			System.out.println(names);
		}driver.close();
	}

}
