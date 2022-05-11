package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("src"));
		element.sendKeys("Pune");
		driver.findElement(By.cssSelector(".autoFill>*:nth-child(2)")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(4)")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector(".next")).click();
		driver.findElement(By.cssSelector("tbody>*:nth-child(5)>*:first-child")).click();
		driver.findElement(By.id("search_btn")).click();
		driver.findElement(By.cssSelector("[class='dept-time dt-time-filter']>*:nth-child(4)")).click();
		driver.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-child(3)>label")).click();
		List<WebElement> allbuses=driver.findElements(By.cssSelector("ul[class='bus-items'] div div div>div>div>.travels.lh-24.f-bold.d-color"));
		List<WebElement> busPrice=driver.findElements(By.cssSelector("ul[class='bus-items'] li div div div>*:nth-child(6)>div span"));
		System.out.println("Buses Available:- "+allbuses.size());
		
		for(int i=0;i<allbuses.size();i++) {
			System.out.println(allbuses.get(i).getText()+"==> "+busPrice.get(i).getText());
		}
	}

}
