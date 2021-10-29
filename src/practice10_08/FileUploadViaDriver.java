package practice10_08;//other method for fileuploadpopup using relative path

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadViaDriver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/upload.html");
		File f= new File("./data/fileupload.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);//send keys uses only absolute path unless a new variable is created.
	}
}