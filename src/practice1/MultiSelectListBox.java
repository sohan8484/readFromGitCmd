package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/API/Multiselect.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		Thread.sleep(2000);
		s.selectByIndex(0);
		s.selectByVisibleText("Voda");
		s.selectByValue("d");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByValue("i");
		s.deselectByVisibleText("Dosa");
		driver.quit();
	}

}
