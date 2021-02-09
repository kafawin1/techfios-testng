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

public class HandelIframe {
	@Test
	public void handelIframeTest() throws InterruptedException {
		//set chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.switchTo().frame("packageListFrame");
		By java_applet_locator = By.xpath("//a[contains(text(),'java.applet')]");
		driver.findElement(java_applet_locator).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		By AppletContext_locator= By.xpath("//span[contains(text(),'AppletContext')]"); 
		driver.findElement(AppletContext_locator).click();
	
		

			
			
		
	            }
	
	
	
	}
	


