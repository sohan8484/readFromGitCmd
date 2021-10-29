package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class DemoTest {
	@Test
	public void testDemo() {
		//System.out.println("welocme to testng");
		Reporter.log("welcome to testng",true);
	}
}
