package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	@Test
	public void openGoogleSite() {
		//set chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		//go to google website
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		//type username in the username field
		//driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("techfiosdemo@gmail.com");
		//type password in the password field
		driver.findElement(By.id("password")).sendKeys("abc123");
		//click on sign in button
		//driver.findElement(By.name("login")).click();
		//--store an element
		WebElement p_element=driver.findElement(By.name("login"));
		p_element.click();
	
	    driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
	   	    driver.findElement(By.id("account")).sendKeys("    Thamer");
	    driver.findElement(By.name("company")).sendKeys("   smart choece");

	}
	
}
