package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www2.asx.com.au/");
		WebDriverManager.chromedriver().setup();
		
		//If table in a frame, Then-
		//Step 1 - Switch to frame which has that particular table
		// Otherwise this is the first name
		//Step 2 - Get the number of rows
		//Step 3 - Get the number of columns
		//Step 4 - Iterate rows and columns and get text and print it.
		
		/*WebElement frame1 = */
				//driver.findElement(By.xpath("//*[@id=\"onetrust-banner-sdk\"]/div"));
		/*driver.switchTo().frame(frame1);*/
		Thread.sleep(3500);
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/li[2]")).click();
		
		//total row
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();
		
		//total Column
		List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr[1]/td"));
		System.out.println(columnelements.size());
		int colsize = columnelements.size();
		
		for (int i=1; i<=rowsize; i++) {
			for (int j=1; j<=colsize; j++){
				System.out.println(driver.findElement(
						By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr["+ i +"]/td["+ j +"]"))
						.getText()+ " ");
				
			}
			System.out.println();
		}
	}

}
		
