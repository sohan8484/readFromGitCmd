package practice10_08;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWH = driver.getWindowHandles();
		for(String wh:allWH) {
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			driver.close();
		}
		
	}
}