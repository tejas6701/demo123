package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tejas");
		driver.findElement(By.name("lastname")).sendKeys("Landge");
		driver.findElement(By.name("reg_email__")).sendKeys("tejaslandge.tl999@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tejaslandge.tl999@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		WebElement dayDropdown=driver.findElement(By.id("day"));
		Select selectDay=new Select(dayDropdown);
		System.out.println("Is daydropdown can select multiple option: "+selectDay.isMultiple());
		selectDay.selectByValue("8");
		WebElement monthDropdown=driver.findElement(By.id("month"));
		Select selectMonth=new Select(monthDropdown);
		selectMonth.selectByVisibleText("Jun");
		WebElement yearDropdown=driver.findElement(By.id("year"));
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByValue("1998");
		driver.findElement(By.cssSelector("span[data-name='gender_wrapper']>*:nth-child(2)")).click();
	}
}
