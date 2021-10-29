package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allSugg = driver.findElements(By.xpath("//a[@rev='most-popular|link']"));//a[@rev='most-popular|link']/h3
		int count = allSugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
