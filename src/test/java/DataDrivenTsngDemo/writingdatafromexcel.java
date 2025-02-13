package DataDrivenTsngDemo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdatafromexcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream("C:\\Users\\WIN 10\\eclipse-workspace\\Cucumberjava\\Testdata\\myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("data");
		   XSSFRow row1=   sheet.createRow(0);
		   row1.createCell(0).setCellValue("welcome");
		   row1.createCell(1).setCellValue("to");
		   row1.createCell(2).setCellValue("Automation");
		   XSSFRow row2=   sheet.createRow(1);
		   row2.createCell(0).setCellValue("welcome");
		   row2.createCell(1).setCellValue("to");
		   row2.createCell(2).setCellValue("Java");
		   XSSFRow row3=   sheet.createRow(2);
		   row3.createCell(0).setCellValue("welcome");
		   row3.createCell(1).setCellValue("to");
		   row3.createCell(2).setCellValue("Testing");
		  
		   workbook.write(file);
		   
		   System.out.println("file is created");
		
		
		
		
		
	}

}
