package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/locatorspractice/");

WebElement userName = driver.findElement(By.id("inputUsername"));
userName.sendKeys("Rahul");

//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.name("inputPassword")).sendKeys("help@123");
driver.findElement(By.className("signInBtn")).click();

String errorMessage = driver.findElement(By.cssSelector("p.error")).getText();
System.out.println(errorMessage);

driver.findElement(By.linkText("Forgot your password?")).click();


driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
//css selector
Thread.sleep(5000);
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john231@gmail.com");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john435@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("7686767556578");
driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
String errrorMsg = driver.findElement(By.cssSelector("p.infoMsg")).getText();
System.out.println(errrorMsg);
driver.findElement(By.xpath("//div[@class = 'forgot-pwd-btn-conainer']/button[1]")).click();


driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("john12");
driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name ='chkboxOne']")).click();
driver.findElement(By.xpath("//button[starts-with(@class,'submit')]")).click();
























	}

}
