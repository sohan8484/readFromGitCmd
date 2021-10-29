package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String url=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).getAttribute("href");
		System.out.println(url);
		driver.close();
	}
}
