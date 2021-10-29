package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode1 {
 static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&ictx=2&sa=X&ved=0ahUKEwj454yj1uvxAhXA8HMBHc2IBr4QPQgJ");
		String htl = driver.getPageSource();
		System.out.println(htl);
		driver.quit();
	}

}
