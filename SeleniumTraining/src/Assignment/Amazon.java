package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("Page Title:- "+driver.getTitle());
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Web Title:- "+driver.getTitle());
		driver.navigate().back();
		System.out.println("Title;- "+driver.getTitle());
		if(driver.getTitle().equals(driver.getTitle())){
			System.out.println("Both titles are matching");
		}else {
			System.out.println("titles are not matching");
		}
		driver.close();
	}
}
