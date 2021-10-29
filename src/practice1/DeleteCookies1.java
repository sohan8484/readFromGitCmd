package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe.");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
