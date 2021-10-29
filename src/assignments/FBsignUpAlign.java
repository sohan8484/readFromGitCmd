package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBsignUpAlign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		Point y1 = driver.findElement(By.xpath("//label[.='Female']")).getLocation();
		int ht = y1.getY();
		Point y2 = driver.findElement(By.xpath("//label[.='Male']")).getLocation();
		int ht2 = y2.getY();
		Point y3 = driver.findElement(By.xpath("//label[.='Custom']")).getLocation();
		int ht3 = y3.getY();
		if (ht==ht2 && ht2==ht3) {
			System.out.println("matching");
		} else {
			System.out.println("mismatch");

		}
		driver.quit();
	}
}