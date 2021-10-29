package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();//open the browser
		@SuppressWarnings("unused")
		WebDriver drive=new ChromeDriver();//open the browser by upcasting
		Demo.test(driver);
		
	}

}
