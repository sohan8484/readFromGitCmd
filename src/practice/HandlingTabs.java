package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTabs = driver.getWindowHandles();
		int count = allTabs.size();
		System.out.println(count);
		for(String tab:allTabs) {
			String title = driver.switchTo().window(tab).getTitle();
			System.out.println(title);
			driver.close();
		}
	}
}