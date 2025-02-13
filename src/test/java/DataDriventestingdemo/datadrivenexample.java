package DataDriventestingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class datadrivenexample {

	public static void main(String[] args) {
		XSSFWorkbookType ExcelWBook = null;
		XSSFSheet ExcelSheet;
		XSSFRow Row;
		XSSFCell Cell;
		//create an object of File class to open file
		File excelfile= new File("C:\\TestData.xlsx");
		try {
			FileInputStream inputstream= new FileInputStream(excelfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
