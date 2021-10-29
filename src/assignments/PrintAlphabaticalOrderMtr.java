package assignments;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabaticalOrderMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		TreeSet<String> sl = new TreeSet<String>();
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOption = s.getOptions();
		int count = allOption.size();
		for (int i = 0; i < count; i++) {
			String text = allOption.get(i).getText();
			boolean nn = sl.add(text);
			System.out.println(nn);
		}
		driver.close();
	}
}
