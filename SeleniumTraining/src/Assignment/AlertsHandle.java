package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class AlertsHandle {

	public static void main(String[] args) {
		SeleniumUtility d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();;
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Tejas Landge");
		driver.switchTo().alert().accept();
	}

}
