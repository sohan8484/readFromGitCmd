package practice1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		WebElement fSelectedOption = s.getFirstSelectedOption();
		String text = fSelectedOption.getText();
		System.out.println(text);
		driver.close();
	}
}
