package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocators {
	
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
		
		driver.get("https://www.saucedemo.com/");
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(withTagName("input").above(password)).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(withTagName("input").below(password)).click();
		driver.close();
	}
	
}
