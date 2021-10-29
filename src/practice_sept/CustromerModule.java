package practice_sept;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustromerModule {
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}

	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
	@Test
	public void editCustomer() {
		Reporter.log("edit customer",true);
	}
	@Test
	public void registerCustomer(){
		Reporter.log("register customer",true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("create customer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("delete customer",true);
	}
}
