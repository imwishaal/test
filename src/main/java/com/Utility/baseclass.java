package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	
	public static ExtentTest test;
	
	public WebDriver driver;
	
	@BeforeMethod
	public void BO() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register?_gl=1*izq4at*_gcl_aw*R0NMLjE2NTc1MTc3MzMuQ2owS0NRanc4YW1XQmhDWUFSSXNBRHFaSm9XU1FDMDktS1pDYkRuV2IyMC1wdnN3cWJSOEppZ3VReXNydHhvVFlINGlqbHIyTjVkUVM1NGFBb2tjRUFMd193Y0I.");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void BC() {
		
		driver.close();
		
		
		
	}

	
}
