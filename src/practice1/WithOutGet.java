package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutGet {
	static {
		System.setProperty( "webdriver.chrome.driver",  "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to( "https://www.google.com/");
		driver.navigate().to( "https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
