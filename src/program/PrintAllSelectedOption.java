package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
	WebElement slvList = driver.findElement(By.id("slv"));
	Select s = new Select(slvList);
	List<WebElement> allOption = s.getAllSelectedOptions();
	int count = allOption.size();
	System.out.println(count);
	for(WebElement name:allOption) {
		String text = name.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
