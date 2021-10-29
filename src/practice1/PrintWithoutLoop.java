package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s =new Select(mtrListBox);
		WebElement allOption = s.getWrappedElement();
		String text = allOption.getText();
		System.out.println(text);
		driver.close();
	}
}
