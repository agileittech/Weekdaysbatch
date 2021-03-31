package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wb = new XSSFWorkbook();
FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\Myexcel.xlsx");
Sheet s = wb.createSheet();
Row r1 = s.createRow(0);
Row r2 = s.createRow(1);
Cell c1 = r1.createCell(0);
Cell c11 = r1.createCell(1);
Cell c2 = r2.createCell(0);
Cell c22 = r2.createCell(1);
c1.setCellValue("Username");
c11.setCellValue("Password");
c2.setCellValue("ABC");
c22.setCellValue("12345");
wb.write(fo);
wb.close();
	}

}
