package JavaBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException, InterruptedException  {
		
		//give me an number of links 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(5000);
String value =driver.findElement(By.cssSelector("a[href* ='soapui']")).getAttribute("href");

URL url = new URL(value);
HttpURLConnection conn =(HttpURLConnection) url.openConnection();
conn.setRequestMethod("HEAD");
conn.connect();
int responseCode =conn.getResponseCode();
System.out.println(responseCode);



//List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='gf-li']/a"));



}
}
