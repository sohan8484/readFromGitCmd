package assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTitlePrint {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		driver.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
		Set<String> allTabs = driver.getWindowHandles();
		
		for(String wh:allTabs) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("actiTIME Time Tracking Software License Agreement")) {
				List<WebElement> head = driver.findElements(By.xpath("//h2"));
				
				int count = head.size();
				for (int i = 0; i < count; i++) {
					System.out.println(head.get(i).getText());
				}
			}
		}
	}
}