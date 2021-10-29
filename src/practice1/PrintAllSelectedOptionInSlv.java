package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOptionInSlv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		List<WebElement> allSOption = s.getAllSelectedOptions();
		int count = allSOption.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allSOption.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
