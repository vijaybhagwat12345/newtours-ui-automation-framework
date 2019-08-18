package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lst=null;
		
		File file = new File("C:\\Selenium\\testing.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet hssfSheet = workbook.getSheet("Sheet2");
		
		
		XSSFRow row = hssfSheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		int lastRow = hssfSheet.getLastRowNum();
		System.out.println("--"+lastRow);
		
		for(int i=0;i<lastRow;++i) {
			XSSFRow rows = hssfSheet.getRow(i);
			int lastcol = rows.getLastCellNum();
			for(int j=0;j<lastcol;++i) {
			String  cols = rows.getCell(j).getStringCellValue();
			System.out.println(cols);
			lst.add(cols);			
			}
		}
		
		System.out.println(lst);
		
		row = hssfSheet.createRow(7);
		cell = row.createCell(0);
		cell.setCellValue("Test");
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
		
		
	}

}
