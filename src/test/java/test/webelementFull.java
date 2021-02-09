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

public class webelementFull {
	@Test
	public void webelementFullTest() {
		//set chrome as default browser
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
				// 1. Open the browser
				WebDriver driver=new ChromeDriver();
				// Set Certain properties
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				// Implicit Wait, Applies to all, Set it once at the beginning
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				// 2. Go to the techfios site,
				driver.get("http://techfios.com/test/billing/?ng=admin/");
				// 3. type user name and password and submit,
	
	            driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
				//driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("2222222222");	
	            //driver.findElement(By.xpath("//*[@id='username']")).sendKeys("11111111111111");
	            driver.findElement(By.id("password")).sendKeys("abc123");
	            driver.findElement(By.name("login")).click();
	            
	            //// Library Of Element
	            By PAGE_TITLE_LOCATOR=By.xpath("//h2[contains(text(),'Dashboard')]");
	            By crm_locater=By.xpath("//*[contains(text(),'CRM')]");
	            By add_contact_locator=By.xpath("//*[contains(text(),'Add Contact')]");
	            By list_contact_locator=By.xpath("//*[contains(text(),'List Contacts')]");
	            By NEWLY_ADDED_DISPLAYED_CONTACT_LOCATOR = By.xpath("//table/tbody/descendant::tr[1]/td[2]/a");
	            
	            
	            By FULL_NAME_INPUT_FIELD_LOCATOR = By.id("account");
	            By COMPANY_NAME_INPUT_FIELD_LOCATOR = By.id("company");
	            By EMAIL_INPUT_FIELD_LOCATOR = By.id("email");
	            By PHONE_INPUT_FIELD_LOCATOR = By.id("phone");
	            By ADDRESS_INPUT_FIELD_LOCATOR = By.id("address");
	            By CITY_INPUT_FIELD_LOCATOR = By.id("city");
	            By STATE_INPUT_FIELD_LOCATOR = By.id("state");
	            By ZIP_INPUT_FIELD_LOCATOR = By.id("zip");
	            By SUBMIT_BUTTON_LOCATOR = By.id("submit");
	           
	            Random rnd=new Random();
	            int randomNumber=rnd.nextInt(999);	
	            
		String fullName = "Deepika" + randomNumber;
		String companyName = "Techfios" + randomNumber;
		String email = "techfios" + randomNumber + "@gmail.com";
		String phone = "1234564" + randomNumber;
		String address = randomNumber + " Street";
		String city = "Irving" + randomNumber;
		String state = "TX";
		String zip = "75062";
	            
	            //Explicit wait Dashboard
	           WebDriverWait wait = new WebDriverWait(driver, 10);
	           wait.until(ExpectedConditions.visibilityOfElementLocated(PAGE_TITLE_LOCATOR));
	          
	         // 4. Open CRM
	            driver.findElement(crm_locater).click();
	           // driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
	        
	            WebDriverWait wait1 = new WebDriverWait(driver, 10);
		           wait.until(ExpectedConditions.visibilityOfElementLocated(add_contact_locator));
		           
		        // 5. click on Add Contact,   
	            driver.findElement(add_contact_locator).click();
	           /// driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
	            
	         // 6. Fill out the form and submit,
		driver.findElement(FULL_NAME_INPUT_FIELD_LOCATOR).sendKeys(fullName);
		driver.findElement(COMPANY_NAME_INPUT_FIELD_LOCATOR).sendKeys(companyName);
		driver.findElement(EMAIL_INPUT_FIELD_LOCATOR).sendKeys(email);
		driver.findElement(PHONE_INPUT_FIELD_LOCATOR).sendKeys(phone);
		driver.findElement(ADDRESS_INPUT_FIELD_LOCATOR).sendKeys(address);
		driver.findElement(CITY_INPUT_FIELD_LOCATOR).sendKeys(city);
		driver.findElement(STATE_INPUT_FIELD_LOCATOR).sendKeys(state);
		driver.findElement(ZIP_INPUT_FIELD_LOCATOR).sendKeys(zip);
		driver.findElement(SUBMIT_BUTTON_LOCATOR).click();

	         // 7. Click on List Contact,
	            driver.findElement(list_contact_locator).click();
	            
	         // 8. Verify that Contact added.
	            String displayedContactName = driver.findElement(NEWLY_ADDED_DISPLAYED_CONTACT_LOCATOR).getText();

	            // Print to see
	            System.out.println("Expected Name" + fullName);
	            System.out.println("actual Name" + displayedContactName);
	            Assert.assertEquals("Relevant contact name not found!", fullName, displayedContactName);


	        /* public void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
	            	WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
	            	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	            	*/
	            }
	
	
	
	}
	


