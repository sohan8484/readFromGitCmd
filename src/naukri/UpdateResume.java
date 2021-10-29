package naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateResume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("shnkhn84@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("LaudeKeBaal12");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//div[.=\"Sohan M S\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\SOHAN\\Desktop\\sohanResume2.pdf");
		Thread.sleep(4000);
		WebElement move = driver.findElement(By.xpath("//div[.='My Naukri']"));
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		driver.quit();
	}

}
