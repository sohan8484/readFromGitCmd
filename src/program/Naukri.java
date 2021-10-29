package program;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
		static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");
			driver.findElement(By.xpath("//div[.='Login']")).click();
			driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("shashi34@gmai.com");
			driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("helloworld");
			driver.findElement(By.xpath("//button[.='Login']")).click();
			driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
			File f= new File("./data/fileupload.docx");
			String path = f.getAbsolutePath();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[@class='uploadContainer'])[1]")).sendKeys(path);
}
}