package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Beforesuite");
	}
	
	@BeforeTest
	private void beforeTest() {
		System.out.println("Beforetest");
	}
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Beforeclass");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	private void test02() {
		System.out.println("Test02");
	}
	
	@Test
	private void test01() {
		System.out.println("Test01");
	}
	
	@AfterSuite
	private void aftersSuite() {
		System.out.println("Aftersuite");
	}
	
	@AfterTest
	private void afterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	
}
