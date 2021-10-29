package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleee {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement resourceTool = driver.findElement(By.xpath("//a[.='Create a Page']"));
		Actions a = new Actions(driver);
		a.moveToElement(resourceTool).perform();
		a.doubleClick(resourceTool).perform();
		
}
}