package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class BasicWebDriverMethods {
	
	//*** Chrome, Firefox, Edge ***//
	public static String browser = "Chrome"; // External Configuration -XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) { 
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	}
		//get(java.lang.String URL): Method -Load a new web page in the current browser window.
		driver.get("https://www.saucedemo.com/");
		
		//manage(): Method -Gets the Option interface.
		driver.manage().window().maximize();
		
		//get current URL(): Method -Get a string representing the current URL that the browser is looking at.
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		//getTitle(): Method -The title of the current page.
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		//get page source(): Method -Get the source of the last loaded page.
		String getPageSource = driver.getPageSource();
		System.out.println(getPageSource);
		
		//navigate(): Method -An abstraction allowing the driver to access the browser’s history and to navigate to a given URL.
		driver.navigate().to("http://google.com");
		
		//Using TimeUnit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//close(): Method -Close the current window, quitting the browser if it’s the last window currently open.
		driver.close();
		
	}
	
}
