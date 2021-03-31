package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Filehandling\\Myexcel.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        Sheet s =  wb.getSheet("Sheet0");
        Row r1 = s.getRow(0);
        Row r2 = s.getRow(1);
        Cell c1 = r1.getCell(0);
        Cell c11 = r1.getCell(1);
        Cell c2 = r2.getCell(0);
        Cell c22 = r2.getCell(1);
        System.out.print(c1.getRichStringCellValue());
        System.out.println(c11.getRichStringCellValue());
        System.out.print(c2.getRichStringCellValue());
        System.out.println(c22.getRichStringCellValue());
        wb.close();
	}

}
