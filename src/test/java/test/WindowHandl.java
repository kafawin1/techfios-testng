package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

public class WindowHandl {
@Test
	public void winHandTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
		By text_locator = By.xpath("//input[@id='header-search-input']");
		By win_locator = By.partialLinkText("Syntax - W3Schools");
		By sq_locator = By.linkText("SQL");
		
		driver.findElement(text_locator).sendKeys("Xpath");
		driver.findElement(text_locator).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(win_locator).click();
		
	    System.out.println(driver.getWindowHandles());
	    
	    for(String s : driver.getWindowHandles()) {
	    driver.switchTo().window(s);
	    }
	    driver.findElement(sq_locator).click();
	    Thread.sleep(4000);
	    
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("scroll(0, 4000)");
	    Thread.sleep(4000);
	    js.executeScript("scroll(0, -4000)");
	}

	
}
