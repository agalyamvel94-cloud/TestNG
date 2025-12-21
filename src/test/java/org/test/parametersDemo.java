package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class parametersDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Parameters({"page"})
	@Test
	public void printPageName(String pagename) {
		System.out.println(pagename);
	}
	
	@Parameters({"user", "pass"})
	@Test
	public void login(String username, String Password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
