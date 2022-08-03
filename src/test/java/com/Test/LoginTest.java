package com.Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Utility.baseclass;

public class LoginTest extends baseclass {
	
	@Test
	public void login() throws Exception  {
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vishal Chavan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("imwishaal@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishaljani@123");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8788053005");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//samp[@class='customcheckbox w-20 h-20 inline-block bg-white border border-gray-20 relative cursor-pointer mr-10']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	
	
	

}
