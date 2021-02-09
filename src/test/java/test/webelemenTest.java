package test;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelemenTest {
	@Test
	public void webTest() throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	//Emplicit wait
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	driver.get("http://techfios.com/test/billing/?ng=admin/");
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	//Explicit wai
	WebDriverWait wait = new WebDriverWait(driver, 1000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login"))));
	
	driver.findElement(By.name("login")).click();
    //stor an element(element)
	By CRM_Locator=By.xpath("//*[contains(text(),'CRM')]");
	By Addcontact=By.xpath("//*[contains(text(),'Add Contact')]");
	driver.findElement(CRM_Locator).click();
	//Thread sleep
	Thread.sleep(3000);
	driver.findElement(Addcontact).click();
	
	
	//stor an element(locator)
	By account_locator=By.id("account");
	By company_locator=By.id("company");
	driver.findElement(account_locator).sendKeys("    Thamer");
	driver.findElement(company_locator).sendKeys("    Smart");
	//   driver.findElement(By.id("account")).sendKeys("    Thamer");
	//    driver.findElement(By.name("company")).sendKeys("   smart choece");

	
	}
	
	
}
