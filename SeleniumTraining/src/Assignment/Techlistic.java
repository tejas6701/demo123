package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[1]/a")).click();
	}
}