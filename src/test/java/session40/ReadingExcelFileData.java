package session40;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingExcelFileData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\ReadExcelFileData\\Test1-ReadData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(1).getLastCellNum();
		System.out.println("Total rows in the sheet:"+rowcount);
		System.out.println("Total cells in the each row:"+cellcount);
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cellcount;j++)
			{
				XSSFCell cell=row.getCell(j);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
  workbook.close();
  file.close();
	}

}
