package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachLoop {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSugg.size();
		System.out.println(count);
		for (WebElement sugg:allSugg) {
			String text = sugg.getText();
			System.out.println(text);
		}
	allSugg.get(0).click();
	driver.quit();
	}
}
