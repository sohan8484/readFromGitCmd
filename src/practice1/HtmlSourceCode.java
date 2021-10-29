package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/brown.html");
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);
		driver.close();
	}

}
