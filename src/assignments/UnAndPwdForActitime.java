package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnAndPwdForActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Point un = driver.findElement(By.name("username")).getLocation();
		int abc = un.getX();
		Point psd = driver.findElement(By.name("pwd")).getLocation();
		int def = psd.getX();
		if (abc==def) {
			System.out.println("match");
		} else {
			System.out.println("unmatch");
		}
		driver.quit();
	}

}
