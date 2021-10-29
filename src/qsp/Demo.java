package qsp;

import org.openqa.selenium.WebDriver;

public class Demo {
	
	public static void test(WebDriver driver) {
		
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
	}

}
