package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Keyboard_Mouse  {

	public static void main(String[] args) {
		SeleniumUtility  d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "http://demo.automationtesting.in/Register.html");

		Actions mouseOps=new Actions(driver);
		WebElement usernameField=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		usernameField.sendKeys("TEJAS");
		mouseOps.doubleClick(usernameField).perform();
		usernameField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		usernameField.sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Landge");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Ahmednagar");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("tejaslandge.tl999@gmail.com");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7887878741");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		Actions act=new Actions(driver);
//		act.click().build().perform();
	}

}
