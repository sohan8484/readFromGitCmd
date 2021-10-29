package practice10_08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty("url");
		System.out.println(data);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}
