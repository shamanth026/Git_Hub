package com.git.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest2 {

	@Test
	public void loginWithInValidData(){
		 // Initialize WebDriver
	WebDriver driver = new FirefoxDriver();
	     // Navigate to GitHub WebSite 
	driver.get("https://github.com/");
		// Maximize Window
	driver.manage().window().maximize();
		// Check if sign-in page is loaded
	driver.findElement(By.linkText("Sign in")).click();
		// Wait For Page To Load
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   //Enter the valid UserName
	driver.findElement(By.id("login_field")).sendKeys("shamanth");
	  //Enter the valid Password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shamanthgithub");
	 // Clicking on 'Sign In' button
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	String expected= "Incorrect username or password.";
	
	try
	{
	WebElement Wb =driver.findElement(By.xpath("//div[@class='container']"));	
	String actual=Wb.getText();
	if(expected.equals(actual))
			{
		System.out.println("Login was Unsuccessful");
	}
	else
	{
		System.out.println("Login was Successful");
		}
	}
	catch(Exception e)
	{
		System.out.println("Not found");
	}
	}
}
