package assignment;//doubt

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickVtiger {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resourceTool = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(resourceTool).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(2000);
		WebElement doble = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(doble).perform();
		a1.doubleClick(doble).perform();
		driver.quit();
	}
}