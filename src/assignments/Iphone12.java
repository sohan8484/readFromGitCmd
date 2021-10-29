package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone12 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button)[2]")).click();
			driver.findElement(By.name("q")).sendKeys("i phone 12 pro max"+Keys.ENTER);
			Thread.sleep(3000);
			 List<WebElement> allphones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro Max') and @class ]"));
			List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro Max') and @class ]/../../div[2]/div[1]/div/div[1]"));
			for (int i = 0; i < allphones.size(); i++) {
				String text = allphones.get(i).getText();
				String price = allPrice.get(i).getText();
				System.out.println(text+price);
			}
		driver.close();
		}
}