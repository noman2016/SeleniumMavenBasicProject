package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomationTest\\\\BrowserDriver\\\\chromedriver.exe");
		
		//*****This URL: https://bonigarcia.dev/webdrivermanager/ using for this.
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		//sendKeys(javadang.CharSequence… keysToSend) – Use this method to simulate typing into an element, which may set its value.
		driver.findElement(By.name("firstname")).sendKeys("testing");
		
		//clear() – If this element is a text entry element, this will clear the value.
		driver.findElement(By.name("firstname")).clear();
		
		//getAttribute(java.lang.String name) – Get the value of the given attribute of the element.
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		
		//getCssValue(java.lang.String propertyName) – Get the value of a given CS.S property.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
		
		//getSizeO – What is the width and height of the rendered element?
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		
		//getLocation() – Where on the page is the top left-hand corner of the rendered element?
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		
		//getText() – Get the visible text
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/h1")).getText());
		
		//getTagName() – Get the tag name of this element.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		
		//isDisplayed() – Is this element displayed or not? This method avoids the problem of having to parse an element’s *style” attribute.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		
		//isEnabled() – Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		
		//isSelected() – Determine whether or not this element is selected or not.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
	}

}
