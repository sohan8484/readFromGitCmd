package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	driver.findElement(By.xpath("//button[.='Click for Prompt Box']")).click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("sohan");
	al.accept();
	boolean check = driver.findElement(By.xpath("//p[contains(text(),'You have entered')]")).isDisplayed();
	if (check==true) {
		System.out.println("name is displayed");
	}
	else {
		System.out.println("not displayed");
	}
}
}
