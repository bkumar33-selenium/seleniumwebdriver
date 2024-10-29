package session40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\ReadExcelFileData\\Test1-WriteData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Flavour");
		row1.createCell(1).setCellValue("Item");
		row1.createCell(2).setCellValue("quantity");
		row1.createCell(3).setCellValue("Price");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Chocalate");
		row2.createCell(1).setCellValue("Cadberry");
		row2.createCell(2).setCellValue("500grms");
		row2.createCell(3).setCellValue("2000Rs");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("Chocalate1");
		row3.createCell(1).setCellValue("Cadberry1");
		row3.createCell(2).setCellValue("500grms1");
		row3.createCell(3).setCellValue("2000Rs1");
		workbook.write(file);
		workbook.close();
		

	}

}
