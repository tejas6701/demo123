package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class VtigerContact {

	public static void main(String[] args) {
	SeleniumUtility d1=new SeleniumUtility();
	WebDriver driver=d1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	driver.findElement(By.cssSelector(".button.buttonBlue")).click();
	driver.findElement(By.cssSelector(".app-navigator>span")).click();
	WebElement element=driver.findElement(By.cssSelector(".app-list>*:nth-child(2)"));
	element.click();
	
	Actions action = new Actions(driver); 
	action.moveToElement(element, 200, 0).click().build().perform();;
	
	driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	driver.findElement(By.cssSelector("td>div>a>span[role='presentation']>b")).click();
	driver.findElement(By.cssSelector(".select2-results>*:nth-child(2)")).click();
	WebElement element1=driver.findElement(By.id("Contacts_editView_fieldName_firstname"));
	element1.sendKeys("Tejas");
	element1.sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys("Landge");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	driver.findElement(By.cssSelector(".module-title")).click();
	driver.findElement(By.cssSelector("span[class='input']>input[type='checkbox']")).click();
	driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
	driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
	
	}
}
