package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();*/

		driver.get("https://smartrajshahi.gov.bd/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_login\"]")).sendKeys("017**######");
		driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("017**######");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/div/form/div[3]/input")).click();
		driver.close();
		
	}

}
