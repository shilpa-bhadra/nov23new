package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FfDemo {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
driver.get("https://www.gmail.com");
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
