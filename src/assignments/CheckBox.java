package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Boolean check=driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		if (check==true) {
			System.out.println("check box is present");
		} else {
			System.out.println("check box is absent");
		}
		driver.quit();
	}

}
