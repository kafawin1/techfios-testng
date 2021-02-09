package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class HandelMouse2 {
	@Test
	public void handelMouseTest() throws InterruptedException {
		//set chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		/*driver.get(" https://www.dell.com/en-us");
		WebElement Solutions_Link=driver.findElement(By.linkText("Solutions"));
		Actions action = new Actions(driver);
		action.moveToElement(Solutions_Link).build().perform();*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us?~ck=mn");

		// Use Actions class to hover over something
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Products"))).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Workstations")).click();


		

			
			
		
	            }
	
	
	
	}
	


