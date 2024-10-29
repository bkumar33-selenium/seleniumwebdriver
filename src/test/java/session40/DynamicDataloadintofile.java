package session40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataloadintofile {

	public static void main(String[] args) throws IOException {
		
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\ReadExcelFileData\\DynamicFile.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("DynamicData");
	Scanner readinput=new Scanner(System.in);
	//String value=readinput.next();
	System.out.println("Enter how many row to create..");
	int TotalRows=readinput.nextInt();
	System.out.println("Enter how many columns to create..");
	int TotalCells=readinput.nextInt();
	for(int r=0;r<=TotalRows;r++)
	{
		XSSFRow row=sheet.createRow(r);
		for(int c=0;c<TotalCells;c++)
		{
			XSSFCell cell=row.createCell(c);
			String value=readinput.next();
			//System.out.println(value);
			cell.setCellValue(value);
		}
	}
	
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File creation completed......");
	

	}

}
