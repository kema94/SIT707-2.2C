package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

//Demonstrating Credit Task: Relative locator APIs in Selenium

public class SeleniumOperations {
	
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void officeworks_registration_page(String url) throws IOException {
		//Locate chrome driver folder (chromium browser) in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver-win64\\chromedriver.exe");
		
		
		// Fixing unable to establish web socket connection to http || selenium java 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver(options);
		
		System.out.println("Driver info: " + driver);
		
		driver.get(url);

		//Sleep a while
		sleep(2);
		
		//Relative elements locating for firstname field in officeworks create account page
		WebElement firstname = driver.findElement(By.id("lastname"));
		driver.findElement(withTagName("input").above(firstname)).sendKeys("Kema");
		
		//Relative elements locating for lastname field in officeworks create account page
		WebElement lastname = driver.findElement(By.id("firstname"));
		driver.findElement(withTagName("input").below(lastname)).sendKeys("Dissanayake");
		
		//Relative elements locating for phoneNumber field in officeworks create account page
		WebElement phoneNumber = driver.findElement(By.id("lastname"));
	    driver.findElement(withTagName("input").below(phoneNumber)).sendKeys("0456855461");
		
	    //Relative elements locating for email field in officeworks create account page
	    WebElement email = driver.findElement(By.id("phoneNumber"));
	  	driver.findElement(withTagName("input").below(email)).sendKeys("kemasanka981@gmail.com");
	  	
	    //Relative elements locating for password field in officeworks create account page
	    WebElement password = driver.findElement(By.id("email"));
	  	driver.findElement(withTagName("input").below(password)).sendKeys("@kemaSanka981");
	  	
	  	
	    //Relative elements locating for confirmPassword field in officeworks create account page
	    WebElement confirmPassword = driver.findElement(By.id("password"));
	  	driver.findElement(withTagName("input").below(confirmPassword)).sendKeys("@kemaSanka981");
	  	

	  	WebElement createAccount = driver.findElement(By.xpath("//button[@data-testid='account-action-btn']"));
	  	driver.findElement(withTagName("button"));
	  	createAccount.click();
		System.out.println("Created an Account in with Click");
		
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
	    File screenshot = ((TakesScreenshot) driver)

	                            .getScreenshotAs(OutputType.FILE);

	    FileUtils.copyFile(screenshot, 
	    		new File("C:\\Users\\kemas\\Desktop\\Deakin University\\"
	    				+ "Trimester 2 2024\\SIT707\\New folder\\2.1P-resources\\img\\screenshot.jpg"));


		sleep(200);
		driver.close();
		
	}
	

	
	
}
