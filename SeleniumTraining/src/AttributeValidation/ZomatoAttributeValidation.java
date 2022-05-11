package AttributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZomatoAttributeValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[role='menu']>*:nth-child(3)")).click();
		WebElement userFieldCord=driver.findElement(By.cssSelector("input[type='number']"));
		Point usernameLocation=userFieldCord.getLocation();
		System.out.println("X Coordinate:- "+usernameLocation.getX());
		System.out.println("Y Coordinate:- "+usernameLocation.getY());
		
		WebElement emailButtonCord=driver.findElement(By.cssSelector("[aria-label='Continue with Email']"));
		Point emailButtonLocation=emailButtonCord.getLocation();
		System.out.println("X Coordinate:- "+emailButtonLocation.getX());
		System.out.println("Y Coordinate:- "+emailButtonLocation.getY());
		
		System.out.println("Email button is after username field:- ");

		
	}

}
