package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/");
        System.out.println("Get Title: "+driver.getTitle());
        System.out.println("Get Title Length: "+driver.getTitle().length());
        System.out.println("Get Url: "+driver.getCurrentUrl());
        if(driver.getTitle().equals("actiTIME - Login")) {
        	System.out.println("Correct Page Opened");
        }else {
        	System.out.println("Correct Page Is Not Opened");
        }
        String sourceCode=driver.getPageSource();
        System.out.println("Source Code: "+sourceCode);
        System.out.println("Source Code Length: "+sourceCode.length());
        driver.close();
	}

}
/*
Launch a new Chrome browser.
Open https://demo.actitime.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Close the Browser.
*/



