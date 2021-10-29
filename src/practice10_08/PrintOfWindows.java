package practice10_08;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintOfWindows {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWindow = driver.getWindowHandles();
		for(String wh:allWindow) {
			System.out.println(wh);
		}
		driver.quit();
	}
}
