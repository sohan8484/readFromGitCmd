package practice1;//present all options in mtr without duplicates

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PresentAllOptionMTR {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		HashSet<String> hs= new HashSet<String>();
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			hs.add(text);
		}
		for(String options:hs) {
			System.out.println(options);
		}
		driver.close();
	}
}