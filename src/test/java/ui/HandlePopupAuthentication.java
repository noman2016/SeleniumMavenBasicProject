package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopupAuthentication {
	
	public static String username = "admin"; //Reading thin this from external XLS or CSV
	public static String password = "admin"; //Reading thin this from external XLS or CSV

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		/*https://the-internet.herokuapp.com/basic_auth*/
		/*https://admin:admin@the-internet.herokuapp.com/basic_auth*/
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		
	}

}
