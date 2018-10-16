package firstpackage;
import java.io.IOException;

public class FromExcelReadClass {
  
	public static void main (String [] args) throws IOException{	
		
		ExcelReadClass excel = new ExcelReadClass();
		String file = "C:\\Users\\Sandy\\eclipse-workspace\\firstproject\\src\\firstpackage\\test.xlsx";
		//String output = excel.ExcelReadMethod(file);
		System.out.println(excel.ExcelReadMethod(file));
		String sss = sheet.getRow(0).getCell(0).getStringCellValue()
		
}
	}