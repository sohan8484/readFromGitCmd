package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Boolean button =driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		if (button==true) {
			System.out.println("login is displayed");
		} else {
			System.out.println("login is not displayed");
		}
		driver.close();
	}

}
