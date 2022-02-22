package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLErrors {
	
	public static String browser = "Chrome"; // External configuration -XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args){
		
		DesiredCapabilities handlingSSLErrors = new DesiredCapabilities();
		
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.merge(handlingSSLErrors);
			driver = new FirefoxDriver(ffoptions);
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions choptions = new ChromeOptions();
			choptions.merge(handlingSSLErrors);
			driver = new ChromeDriver(choptions);
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlingSSLErrors.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			EdgeOptions edgeoptions = new EdgeOptions();
			edgeoptions.merge(handlingSSLErrors);
			driver = new EdgeDriver(edgeoptions);
		}
		
		driver.get("https://expired.badssl.com/");
		
		/*
		WebDriverManager.chromedriver().setup();
		//Global Profile
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		//Or,
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions choptions = new ChromeOptions();
		choptions.merge(dc);
		
		ChromeDriver driver =new ChromeDriver(choptions);
		driver.get("https://expired.badssl.com/");	*/
		
		
	}

}
		
