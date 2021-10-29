package practice;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodKillChild {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String PWH = driver.getWindowHandle();
		System.out.println(PWH);
		Set<String> allWH = driver.getWindowHandles();
		System.out.println(allWH);
		for (String wh : allWH) {
			driver.switchTo().window(wh);
			if (!PWH.equals(allWH)) {
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
			}
		}
		driver.quit(); 
	}
}