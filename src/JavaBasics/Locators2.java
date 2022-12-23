package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("john12");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[starts-with(@class,'submit')]")).click();
		String validateMsg = driver.findElement(By.tagName("p")).getText();
		System.out.println(validateMsg);

	}
}
