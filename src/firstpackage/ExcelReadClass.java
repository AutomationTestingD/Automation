package firstpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadClass {

    

	public String ExcelReadMethod(String filepath) throws IOException 
	{		
		File file =new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

	return (sheet.getRow(0).getCell(0).getStringCellValue());
}
	