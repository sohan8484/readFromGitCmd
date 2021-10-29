package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetXAndY {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Point login = driver.findElement(By.name("login")).getLocation();
		int x= login.getX();
		int y= login.getY();
		System.out.println(x+" and "+y);
		driver.quit();
	}

}
