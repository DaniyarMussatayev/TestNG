package com.syntax.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println(" ---- This is before class annotation ----");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" ---- This is after class annotation ----");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("This is TEST1 method");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("This is TEST2 method");
	}
	

}

//Task
//
//Task 1: Executing different test based TestNG annotations
//
//
//
//Create class that will have:
//Before and After Class annotation
//Before and After Method annotation
//2 methods with Test annotation
//
//
//Observe the results!
