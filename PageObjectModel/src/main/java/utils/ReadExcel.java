package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	public static String[][] testData(String excelFileName) throws IOException
	{
		XSSFWorkbook excelFile = new XSSFWorkbook("./testdata/"+excelFileName+".xlsx"); //class object to access excel
		
		XSSFSheet sheet1 = excelFile.getSheetAt(0); //to access the first sheet in the excel
		int rowCount = sheet1.getLastRowNum(); //get row count
		System.out.println("Row count is: "+rowCount);
		
		short columnCount = sheet1.getRow(0).getLastCellNum();// to get column count
		System.out.println("Column count: "+columnCount);
		
		//create a 2D array to store read data from excel
		String[][] data = new String[rowCount][columnCount];
 		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet1.getRow(i); //to go to i row
			System.out.println("*** row "+i +" values***");
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cellValue = eachRow.getCell(j);
				data[i-1][j]=cellValue.toString();
				
			    
				System.out.println(cellValue.toString());
				
			}
			
		}
		
		excelFile.close();
		return data;
	}

}
