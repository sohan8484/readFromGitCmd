package practice1;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PresentMTRWithDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		HashSet<String> hs = new HashSet<String>();
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s =new Select(mtrList);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			if (hs.add(text)==false) {
				System.out.println(text);
			}
		}
		driver.close();
	}
}
