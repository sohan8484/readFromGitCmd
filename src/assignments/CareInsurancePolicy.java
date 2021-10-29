package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurancePolicy {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.name("dob")).click();//click on dob
		driver.findElement(By.id("ui-datepicker-div"));//calender table
		
		WebElement selectMonth = driver.findElement(By.xpath("(//select)[1]"));//month
		Select month=new Select(selectMonth);
		month.selectByIndex(3);
		
		WebElement selectYear = driver.findElement(By.xpath("(//select)[2]"));
		Select year= new Select(selectYear);
		year.selectByValue("2000");
		
		WebElement selectDate = driver.findElement(By.xpath("(//td/a)[5]"));
		selectDate.click();
		driver.findElement(By.id("alternative_number")).sendKeys("9988776655");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean msg = driver.findElement(By.id("policynumberError")).isDisplayed();
		
		if (msg==true) {
			System.out.println("u got it");
		}
		else {
			System.out.println("try again");
		}
		driver.close();
	}
}
