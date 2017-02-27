package script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/Ricky/Desktop/html/Test1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//go to sheet 1 - row 0 - cell 0
		Cell c = wb.getSheet("Sheet1").getRow(1).getCell(0);
		//get value present
		String v = c.toString();
		System.out.println("The value is " +v);
		fis.close();
		// to find the last row number +1
		int rc = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println("The row count is "+ (rc+1));
		// to find the last coloumn number
		int colcount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println("the coloumn count is " +colcount);
		
		 Cell d = wb.getSheet("Sheet1").getRow(2).getCell(2);
			d.setCellValue("def");
		 FileOutputStream fos = new FileOutputStream("C:/Users/Ricky/Desktop/html/Test1.xlsx");
		 wb.write(fos);
		
	}

}
