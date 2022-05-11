package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Home Page Title: "+driver.getTitle());
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Actual title is matching with the printed home page title on console");
		}else {
			System.out.println("The title is not matching");
		}
		driver.close();
	}

}
/*1. Launch the web browser.
2. Open the URL https://www.facebook.com in the current browser
3. Fetching home page title
4. Verify actual tile of the home page with the
5. Print home page title on the console
6. Close the browser*/