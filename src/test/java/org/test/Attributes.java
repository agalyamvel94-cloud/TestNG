package org.test;

import org.testng.annotations.Test;

public class Attributes {

	@Test(priority=-2, expectedExceptions=Exception.class)
	private void Login() {
		System.out.println("It is a Login Functionality");
		System.out.println(10/0);
	}
	
	@Test(priority=-1, description="Login function", dependsOnMethods="Login", alwaysRun=true)
	private void homepage() {
		System.out.println("It is a Homepage Functionality");
	}
	
	@Test(priority=1, enabled=true)
	private void productPage() {
		System.out.println("It is a Productpage Functionality");
	}
	
	@Test(priority=0, invocationCount = 2, invocationTimeOut=2000)
	private void SearchPage() {
		System.out.println("It is a SearchPage Functionality");
	}
	
	@Test(priority=2, timeOut=2000)
	private void Logout() throws InterruptedException {
		System.out.println("It is a Logout Functionality");
		 //Thread.sleep(2000);
	}
}
