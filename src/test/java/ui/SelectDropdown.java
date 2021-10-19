package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");

		// *****This URL: https://bonigarcia.dev/webdrivermanager/ using for this.
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.sugarcrm.com/au/request-demo/");
		 * driver.manage().window().maximize(); WebElement dropdown =
		 * driver.findElement(By.name("employees_c")); Select select = new
		 * Select(dropdown);
		 */

		/*
		 * select.selectByValue("level1"); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * select.selectByVisibleText("51 - 100 employees"); try { Thread.sleep(2000); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * select.selectByIndex(5); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

//		Part 2

		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("selenium_commands"));
		Select select = new Select(dropdown);

		/*
		 * select.selectByValue("level1"); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		select.selectByVisibleText("Navigation Commands");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		select.selectByIndex(3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> allItems= select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		
		select.selectByVisibleText("Navigation Commands");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		select.selectByIndex(3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select.deselectByIndex(3);
		List<WebElement> allItems1= select.getAllSelectedOptions();
		System.out.println(allItems1.size());

	}

}
