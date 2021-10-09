package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverInterface {
	
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
		
		driver.get("https://smartrajshahi.gov.bd/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_login\"]")).sendKeys("01750671332");
		driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("01750671332");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/div/form/div[3]/input")).click();
		driver.close();

	}
	
}
