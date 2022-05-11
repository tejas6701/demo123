package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		WebElement validate=driver.findElement(By.cssSelector("._37M3Pb>*"));
		System.out.println("Is Page Displayed: "+validate.isDisplayed());
		System.out.println("Is Page Editable: "+validate.isEnabled());
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector("._37M3Pb>*"));
		System.out.println("Elements Count:- "+allOptions.size());
		for(int i=0;i<allOptions.size();i++) {
		System.out.print("  "+allOptions.get(i).getText());
		}
		driver.close();
		
	}

}
