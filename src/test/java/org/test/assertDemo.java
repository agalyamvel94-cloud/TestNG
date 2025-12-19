package org.test;

import static org.testng.AssertJUnit.assertEquals;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;




public class assertDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	@Test(priority=-2)
	public void incorrectPasswordVerification() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("agalyamvel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1456");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		@Nullable
		String currentUrl3 = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl3.contains("authentication"));
	}
	
	
	
	@Test(priority=-1)
	public void loginTitleVerification() {
		@Nullable
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@Test(priority=0)
	public void createNewAccountIsEnabled() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/r.php?entry_point=login']")).click();
		//Thread.sleep(3000);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("entry_point=login"));
	}
	
	@Test(priority=1)
	public void forgottonPasswordIsEnabled() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		Thread.sleep(3000);
		@Nullable
		String currentUrl2 = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl2.contains("recover"));
	}
	
	@Test(priority=2)
	public void verifyElementText() {
	    
	    WebElement element = driver.findElement(By.xpath("//h2[@class='_8eso']"));
	    String actualText = element.getText();
        Assert.assertTrue(actualText.contains("Facebook helps you connect and share with the people in your life."), 
	        "The word  was not found in the element!");
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//	
	

}
