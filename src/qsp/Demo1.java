package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  ChromeDriver c=new ChromeDriver();
		  c.get("https://www.instagram.com/");
	}

}
