package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAssignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 String url = driver.getCurrentUrl();
		 if (url.contains("google.com")) {
			System.out.println("present");
			System.out.println(url);
		} else {
			System.out.println("no");
		}
		 driver.quit();
	}

}
