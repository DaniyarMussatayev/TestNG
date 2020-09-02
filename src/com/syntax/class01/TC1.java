package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test
	public void validLogin() {

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
//TC 1: HRMS Application Login: 
//
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password
//Click on login button
//Then verify Syntax Logo is displayed
//Close the browser
