package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;
public class YouTube {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("main yaha hu yaha");
		driver.findElement(By.cssSelector("#search-icon-legacy>yt-icon")).click();
	}

}
