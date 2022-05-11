package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class SuaceDemoLogin {

	public static void main(String[] args) {
		SeleniumUtility d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "https://www.saucedemo.com/");
		
		String cred=driver.findElement(By.id("login_credentials")).getText();
//		System.out.println(cred);
		String [] loginDetails=cred.split(" ");
		System.out.println(loginDetails[3]);
			
	}

}
