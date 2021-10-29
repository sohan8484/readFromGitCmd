package assignments;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriUploadResume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("shashi34@gmai.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("helloworld");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(3000);
		File f= new File("./data/fileupload.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(path);
		driver.quit();
	}
}
