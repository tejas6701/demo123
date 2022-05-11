package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Title Length: "+driver.getTitle().length());
		System.out.println("Page Url: "+driver.getCurrentUrl());
		if(driver.getTitle().equals("Execute Automation")) {
			System.out.println("Correct Page Opened");
		}else {
			System.out.println("Incorrect Page Opened");
		}
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
//		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
