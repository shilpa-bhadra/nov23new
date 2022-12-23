package JavaBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {
		//give me an number of links 
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		

		
		Actions actions = new Actions(driver);
		
		WebElement calendar = driver.findElement(By.cssSelector("input#form-field-travel_comp_date"));
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#form-field-travel_comp_date")));
		//actions.moveToElement(calendar).build().perform();
		Thread.sleep(4000);
		calendar.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//div[@class='flatpickr-current-month']/span
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span")).getText().contains("June")) {
			
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();	
				
			}		
		
		
		List<WebElement> datesList = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		
		for(WebElement dateseach :datesList) {
			if(dateseach.getText().contains("22")){
				WebDriverWait wait1 = new WebDriverWait(driver,50);
				wait1.until(ExpectedConditions.elementToBeClickable(dateseach));
				dateseach.sendKeys(Keys.ENTER);
				break;
				
			}
			
			
		}

	}

}
