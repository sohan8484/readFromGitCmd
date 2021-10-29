package practice1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the option");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String eText = sc.nextLine();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/SOHAN/Desktop/htmlLinks/Multiselect.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		int counter=0;
		for (int i = 0; i < count; i++) {
			String aText = allOptions.get(i).getText();
			if (aText.equals(eText)) {
				counter++;
			}
		}
		if (counter==0) {
			System.out.println(eText+" not present");
		}
		if (counter==1) {
			System.out.println(eText+" is present without duplicate");
		}
		if (counter>1) {
			System.out.println(eText+" is present with duplicate");
		}
		driver.close();
	}
}
