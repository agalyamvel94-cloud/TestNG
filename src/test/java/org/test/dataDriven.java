package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {
	WebDriver driver;
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test(dataProvider="data")
	public void titleVerification(String title) {
		Assert.assertEquals(driver.getTitle(), title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(dataProvider="datas")
	public void login(String username, String Password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		Thread.sleep(3000);
	}
	
	@DataProvider
	public String[] data() {
		String [] arr = {"OrangeHRM"};
		return arr;
	}	
	
	@DataProvider
	public String[][] datas() {
		String [] [] arr1 = {{"Admin", "admin123"},
				           {"Oranium", "Oranium123"},
				           {"jen", "Jen123"}};
				           return arr1;
	}

}
