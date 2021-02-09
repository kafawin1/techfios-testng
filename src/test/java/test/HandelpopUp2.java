package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class HandelpopUp2 {
	@Test
	public void handelPopTest() throws InterruptedException {
		//set chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By go_locator = By.name("proceed");
		driver.findElement(go_locator).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		//System.out.print(driver.switchTo().alert().getText());

	        /* public void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
	            	WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
	            	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	            	*/
	            }
	
	
	
	}
	


