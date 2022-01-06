package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");
		
		//*****This URL: https://bonigarcia.dev/webdrivermanager/ using for this.
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		//Method 01//
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();*/
		
		//Method 02//
		/*driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();*/
		
		//Method 03//
		/*WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/ /*accept(); alternate dismiss();*/
		
		//Method 04//
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		Alert alertOnPage = driver.switchTo().alert();
		
		alertOnPage.sendKeys("Noman");
		Thread.sleep(2000);
		alertOnPage.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		//driver.close();
	}
}
