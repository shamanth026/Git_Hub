package com.git.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void loginWithValidData(){
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
		driver.findElement(By.id("login_field")).sendKeys("shamanth026");
		//Enter the valid Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shamanth026@github");
		//// Clicking on 'Sign In' button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Validate Log-In was Successful
		boolean title = driver.getTitle().equals("GitHub");
		if(title){
			System.out.println("Log-in is valid");
		}
			else if(!title){
				System.out.println("Log-in is invalid");
			}	
		//clicking on DropDown button
		driver.findElement(By.xpath("//a[img[@width='20']]")).click();
		//clicking on Sign Out button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
	}
}

