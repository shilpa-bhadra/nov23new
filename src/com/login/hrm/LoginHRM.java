package com.login.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/////Notes: 
////Multiple lines comment -> ctrl+shift+/
///For un commenting multiple lines -> ctrl+shift+\
////For commenting single line -> ctrl+/




public class LoginHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("user");
		  
		  driver.findElement(By.id("txtPassword")).sendKeys("user123");
		  driver.findElement(By.id("btnLogin")).click();
		 
		  
		 
		
		

	}

}
