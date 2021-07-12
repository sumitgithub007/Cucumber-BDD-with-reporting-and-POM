package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderFile {

	
	List<String> alist = new ArrayList<String>();
	
	
	
	 public List<String> getData(String filepath,String sheetname,int i) throws IOException
	 {
		 
		 
		
			FileInputStream fis = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			System.out.println("last row num"+ sheet.getLastRowNum());
			
			Row r = sheet.getRow(1);
			 
			System.out.println("Last cell =" +r.getLastCellNum());
		  
			
			System.out.println( sheet.getRow(1).getCell(0).getStringCellValue());
			
			 	for(int j=0;j<r.getLastCellNum();++j)
				{
				
			      	if(sheet.getRow(i).getCell(j).getCellType()==CellType.STRING)
			      	{
			      		String value = sheet.getRow(i).getCell(j).getStringCellValue();
			      		System.out.print(value +" ");
			      		alist.add(value);
			      	}
			      	
			      	else
			      	{
			      	
			      		DataFormatter formatter = new DataFormatter();
			      		String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
			      		    	 
			      		 
			      	       
			      		System.out.print(value +"  ");
			      		alist.add(value);
			      	}
			}
				System.out.println();
					 
			
		
		
		
		   return alist;
		
		
		
		
		
	}
	
	
	
	 }
