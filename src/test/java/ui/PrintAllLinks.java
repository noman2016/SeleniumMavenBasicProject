package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");
		
		//*****This URL: https://bonigarcia.dev/webdrivermanager/ using for this.
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		//driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		
		//List<WebElement> allTags = driver.findElementsByTagName("a");
		List<WebElement> allTags = driver.findElementsByTagName("option");
		System.out.println("Total tags are: "+allTags.size());
		
		for (int i=0; i<allTags.size(); i++)
		{
			//System.out.println("Links on page are "+allTags.get(i).getAttribute("href"));
			System.out.println("Options Value on page are "+allTags.get(i).getAttribute("value"));
			//System.out.println("Links on page are "+allTags.get(i).getText());
			System.out.println("Options name on page are "+allTags.get(i).getText());
			System.out.println("\n");
		}
		
		driver.quit();

	}

}
