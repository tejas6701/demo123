package Assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTaskCreation {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector("div[class='addNewButton']>*:nth-child(3)")).click();
	driver.findElement(By.cssSelector(".item.createNewTasks")).click();
	driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div>div>*:nth-child(3)"));
//	
	}
}
//driver.findElement(By.cssSelector("div[style='display: block; top: 30.0051px; left: 0px;'] [class='searchItemList']>*:nth-child(6)")).click();
//Select selectDropdown=new Select(element);
//selectDropdown.selectByVisibleText("Our Company");