package DataDrivenTsngDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcel {
	
public static void main(String[]args) throws IOException {
	
	FileInputStream  file= new FileInputStream("C:\\Users\\WIN 10\\eclipse-workspace\\Cucumberjava\\Testdata\\exceltestdata.xlsx");
	
	
	XSSFWorkbook workbook =new XSSFWorkbook(file);
    XSSFSheet sheet= workbook.getSheet("Sheet1");
             int totalRows=sheet.getLastRowNum();
         int totalCells= sheet.getRow(1).getLastCellNum();
         
         System.out.println("number of rows" +totalRows );
         System.out.println("number of cells" +totalCells );
         
         for(int r=0; r<=totalRows;r++){
        	XSSFRow currentrow=sheet.getRow(r);
        	 
         for(int c=0;c<totalCells;c++) {
        XSSFCell cell=	 currentrow.getCell(c);
        	 System.out.print(cell.toString()+"\t");
         }	
         System.out.println();
         }
         
         
         
}
}
