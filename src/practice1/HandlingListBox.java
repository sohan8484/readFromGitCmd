package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement monthListBox = driver.findElement(By.id("month"));//open month tab
		Select month = new Select(monthListBox);//calling non static method select class
		month.selectByValue("5");//05/may/1990
		Thread.sleep(2000);
		WebElement dayList = driver.findElement(By.id("day"));
		Select day = new Select(dayList);
		day.selectByIndex(5);
		WebElement yearList = driver.findElement(By.id("year"));
		Select year = new Select(yearList);
		year.selectByVisibleText("1990");
	}
}