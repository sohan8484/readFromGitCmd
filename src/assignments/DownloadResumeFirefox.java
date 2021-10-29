package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadResumeFirefox {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("shashi34@gmai.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("helloworld");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='UPDATE PROFILE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[.='Download'])[1]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}