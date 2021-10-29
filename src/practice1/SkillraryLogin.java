package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLogin {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.id("email")).sendKeys("sohan84@outlook.com");
		driver.findElement(By.name("password")).sendKeys("laudekebaal");
		driver.findElement(By.xpath("(//div[@role='presentation'])[1]")).click();
		
		
	}

}
