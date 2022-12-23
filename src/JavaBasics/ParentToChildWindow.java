package JavaBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		
		Set<String> windows =driver.getWindowHandles();
		
		Iterator<String> it =windows.iterator();
		
		String parentId = it.next();
		String childtId = it.next();
		
		driver.switchTo().window(childtId);
		String textreq = driver.findElement(By.xpath("//p[@class='im-para red']//a")).getText();
		System.out.println(textreq);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(textreq);
		
	}

}
