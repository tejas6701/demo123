package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tejas");
		driver.findElement(By.name("lastname")).sendKeys("Landge");
		driver.findElement(By.name("reg_email__")).sendKeys("tejas@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tejas@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		WebElement element=driver.findElement(By.id("day"));
		Select daySelect=new Select(element);
		daySelect.selectByValue("8");
		WebElement element1=driver.findElement(By.id("month"));
		Select monthSelect=new Select(element1);
		monthSelect.selectByVisibleText("Jun");
		
		
	}

}
