package practice10_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 1']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(source, target).perform();
		driver.close();
	}
}
