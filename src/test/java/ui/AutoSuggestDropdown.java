package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");
		
		//*****This URL: https://bonigarcia.dev/webdrivermanager/ using for this.
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		from.sendKeys("sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
