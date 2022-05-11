package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("Home Page Title:-"+driver.getTitle());
		driver.findElement(By.linkText("Amazon Pay")).click();
		System.out.println("Amazon Pay Page Title:-"+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Best Sellers")).click();
		System.out.println("Best Sellers Page Title:-"+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Customer Service")).click();
		System.out.println("Customer Service Page Title:-"+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Fashion")).click();
		System.out.println("Fashion Page Title:-"+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Mobiles Page Title:-"+driver.getTitle());
		driver.navigate().back();
		driver.close();

	}

}
