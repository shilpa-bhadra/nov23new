package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Different_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		// xpath
		driver.findElement(By.xpath("//*[@data-action-type ='DISMISS']")).click();
		// partial linktext
		driver.findElement(By.partialLinkText("Deliver to")).click();
		// xpath with name
		driver.findElement(By.xpath("//*[@name = 'glowDoneButton']")).click();
		// linktext
		Thread.sleep(10000);
		driver.findElement(By.linkText("All")).click();
		// css selector
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div.nav-sprite.hmenu-close-icon")).click();
		// using text function

		// driver.findElement(By.xpath("//*[text()='Customer Service']")).click();
		// starts with
		driver.findElement(By.xpath("//*[starts-with(text(),'Today')]")).click();

	}

}
