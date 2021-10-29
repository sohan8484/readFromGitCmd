package genericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Generic class for data driven testing
 * @author SOHAN
 *
 */
public class FileLib {
	/**
	 * generic method to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * generic method to read the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws IOException{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * generic method to read the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException
	 */
	public void setExcelData(String sheetname, int row, int cell, String data) throws IOException {
		FileInputStream fis = new FileInputStream("./data/testscript2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/testscript2.xlsx");
		wb.write(fos);
		wb.close();
	}
}
