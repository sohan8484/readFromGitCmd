package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int wid1 = driver.findElement(By.id("username")).getSize().getWidth();
		int wid2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if (wid1==wid2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		driver.quit();
	}
}
