package practice10_08;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExceptParent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		Set<String> allWH = driver.getWindowHandles();
		for(String wh:allWH) {
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			if (!wh.equals(pwh)) {
				driver.close();
			}
		}
	}
}