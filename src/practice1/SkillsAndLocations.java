package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillsAndLocations {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		int height1 = driver.findElement(By.id("qsb-keyword-sugg")).getSize().getHeight();
		int height2 = driver.findElement(By.name("location")).getSize().getHeight();
		if (height1==height2) {
			System.out.println("they are in same hight");
		} else {
			System.out.println("different hight");
		}
		System.out.println(height1);
		System.out.println(height2);
		driver.quit();
	}
}
