package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		//give me an number of links 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElements(By.tagName("a")).size());
//get me the count of the link in the footer section

WebElement footerDriver =driver.findElement(By.id("gf-BIG"));
System.out.println(footerDriver.findElements(By.tagName("a")).size());

//what the link count of the firstcolumn in footer section

WebElement columnDriver =footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
System.out.println(columnDriver.findElements(By.tagName("a")).size());

for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
	String clinkOnEachLinks =Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clinkOnEachLinks);
	Thread.sleep(4000);
}
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it =windows.iterator();
	
	while(it.hasNext()) {
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
		
	
	

	
}

	}

}
