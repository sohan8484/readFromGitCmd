package practice10_08;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WithoutHardcodingCellValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		short cellcount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String un = wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(un);
			}
		}
	}
}
