package practice1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadedWithinTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
			driver.get("https://www.google.com/");
			System.out.println("page loaded within 3 sec");
		} catch (TimeoutException e) {
			System.out.println("page is not loaded within 3 sec");
		}
		driver.quit();
}
}