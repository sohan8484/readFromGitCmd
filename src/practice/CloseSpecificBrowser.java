package practice;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("enter the title");
		Scanner sc = new Scanner(System.in);
		String expectedTitle = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allTab = driver.getWindowHandles();
		for(String wh:allTab) {
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(expectedTitle)) {
				driver.close();
			}
		}
	}
}