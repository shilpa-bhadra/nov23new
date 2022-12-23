package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		int sizeOftheRow =driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//td[4]")).size();
		int sum =0;
		
		for(int i=0;i<sizeOftheRow;i++) {
			int reqValue =Integer.parseInt(driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//td[4]")).get(i).getText());
			sum =sum+reqValue;
		}
		System.out.println(sum);
String value =driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();

	}

}
