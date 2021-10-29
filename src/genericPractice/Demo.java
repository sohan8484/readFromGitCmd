package genericPractice;

import java.io.IOException;

import genericLibrary.FileLib;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
	/**	String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	//	String custName = f.getExcelData("Customer", 1, 2);
	//	System.out.println(custName);**/
		f.setExcelData("test", 2, 3, "string");
	//	f.setExcelData("test", 1, 4, "value");
	}
}