package practice10_08;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allTab = driver.getWindowHandles();
		for(String wh:allTab) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
}