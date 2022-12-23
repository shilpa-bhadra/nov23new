package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");
		Actions actions = new Actions(driver);
		WebElement mouseOverOnthis =driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(mouseOverOnthis).build().perform();
		//entering in capital letters in search box
		
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
actions.click(searchBox).keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
actions.contextClick(mouseOverOnthis).build().perform();

	}

}
