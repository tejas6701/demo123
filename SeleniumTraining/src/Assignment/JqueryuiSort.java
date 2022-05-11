package Assignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.SeleniumUtility;
public class JqueryuiSort {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		List<WebElement> source=driver.findElements(By.cssSelector("body>ul>li"));
		List<WebElement> target=driver.findElements(By.cssSelector("body>ul>li"));
		for(int i=source.size()-1;i>0;i--) {
			act.dragAndDrop(source.get(i), target.get(0)).build().perform();
		}

	}
	
}
