package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement usenameInputField=driver.findElement(By.id("username"));
		usenameInputField.clear();
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		
		usenameInputField.sendKeys("admin");
		passwordInputField.sendKeys("Test@123");
		
		WebElement signInField=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		signInField.click();
	}

}
