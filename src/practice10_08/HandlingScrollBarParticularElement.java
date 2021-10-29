package practice10_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarParticularElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		int y = driver.findElement(By.partialLinkText("//span[contains(text(),'Editor’s Picks')]")).getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,"+ y +")");
}
}
