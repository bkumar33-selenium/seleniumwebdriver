package session41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteDataUtility {

	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fo;
	public static CellStyle style;
	
		public static int getRowCount(String xfile,String sheet) throws IOException  
		{
			fi=new FileInputStream(xfile);
			wb=new XSSFWorkbook(fi);
			sh=wb.getSheet(sheet);
			int row=sh.getLastRowNum();
			wb.close();
			fi.close();
			return row;					
		}
		public static int getCellCount(String xfile,String sheet,int rownum) throws IOException
		{
			fi=new FileInputStream(xfile);
			wb=new XSSFWorkbook(fi);
			sh=wb.getSheet(sheet);
			row=sh.getRow(rownum);
			int cellcount=row.getLastCellNum();
			wb.close();
			fi.close();
			return cellcount;			
		}
		
        public static String getCellValue(String xfile,String sheet,int rownum,int cellnum) throws IOException
        {
        	fi=new FileInputStream(xfile);
        	wb=new XSSFWorkbook(fi);
        	sh=wb.getSheet(sheet);
        	row=sh.getRow(rownum);
        	cell=row.getCell(cellnum);
        	String data;
        	try
        	{
        	//data=cell.toString();
        	DataFormatter formater=new DataFormatter();
        	data=formater.formatCellValue(cell);
        	}
        	catch(Exception e)
        	{
        		data="";
        	}
        	wb.close();
        	fi.close();
        	return data;
        }
    
        public static void putCellValue(String xfile,String sheet,int rownum,int cellnum,String value) throws IOException
        {
        	fi=new FileInputStream(xfile);
        	wb=new XSSFWorkbook(fi);
        	sh=wb.getSheet(sheet);
        	row=sh.getRow(rownum);
        	cell=row.createCell(cellnum);
        	cell.setCellValue(value);
        	fo=new FileOutputStream(xfile);
        	wb.write(fo);
        	wb.close();
        	fi.close();
        	
    }
     public static void fillGreenColor(String xfile,String sheet,int rownum,int cellnum,String value) throws IOException   
     {
    	 fi=new FileInputStream(xfile);
     	wb=new XSSFWorkbook(fi);
     	sh=wb.getSheet(sheet);
     	row=sh.getRow(rownum);
     	cell=row.getCell(cellnum);
     	style=wb.createCellStyle();
     	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
     	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     	cell.setCellStyle(style);
     	fo=new FileOutputStream(xfile);
     	wb.write(fo);
     	wb.close();
     	fi.close();
     	fo.close();

     }
     public static void fillRedColor(String xfile,String sheet,int rownum,int cellnum,String value) throws IOException   
     {
    	 fi=new FileInputStream(xfile);
     	wb=new XSSFWorkbook(fi);
     	sh=wb.getSheet(sheet);
     	row=sh.getRow(rownum);
     	cell=row.getCell(cellnum);
     	style=wb.createCellStyle();
     	style.setFillForegroundColor(IndexedColors.RED.getIndex());
     	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     	cell.setCellStyle(style);
     	fo=new FileOutputStream(xfile);
     	wb.write(fo);
     	wb.close();
     	fi.close();
     	fo.close();

     }
	}


