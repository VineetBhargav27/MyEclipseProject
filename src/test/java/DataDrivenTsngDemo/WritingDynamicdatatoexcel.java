package DataDrivenTsngDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicdatatoexcel {
	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream("C:\\Users\\WIN 10\\eclipse-workspace\\Cucumberjava\\Testdata\\dynamicfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("Dynamic_data");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter how many row?");
		  int noOfRows=sc.nextInt();
		  System.out.println("enter how many cell?");
		  int noOfCells=sc.nextInt();
		  
		  for(int r=0;r<=noOfRows;r++) {
			  XSSFRow  currentrow=sheet.createRow(0);
			  for(int c=0;c<noOfCells;c++) {
				  XSSFCell cell= currentrow.createCell(c);
				  cell.setCellValue(sc.next());
			  }
		  }
		  
		   workbook.write(file);
		   
		   System.out.println("file is created");
		
		
		
		
		
	}

}
	

