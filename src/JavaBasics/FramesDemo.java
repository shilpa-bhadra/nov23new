package JavaBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilpab\\OLB_eclipse_workspace\\MyPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");

Actions actions = new Actions(driver);
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
WebElement source = driver.findElement(By.id("draggable"));
WebElement target =driver.findElement(By.id("droppable"));
actions.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();






	}

}
