package org_day4ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exechtostringg {
	public static void main(String[] args) throws IOException {
		

        File f=new File("C:\\Users\\91805\\eclipse-workspace\\MavenProject\\src\\test\\resources\\sheet1.xlsx");
						
				FileInputStream f1=new FileInputStream(f);		
				
		Workbook w=new XSSFWorkbook(f1);
		
		Sheet s1 = w.getSheet("sheet1");
		Row r = s1.getRow(4);
		Cell c1 = r.getCell(4);
		
		int c2 = c1.getCellType();
		System.out.println(c2);
		
		
		if(c2==1) {
			String value = c1.getStringCellValue();
			System.out.println(value);
		}else {
			if(DateUtil.isCellDateFormatted(c1)) {
				Date da1 = c1.getDateCellValue();
				SimpleDateFormat dte=new SimpleDateFormat("dd/yyyy/MMM");
				String dat2 = dte.format(da1);
				System.out.println(dat2);
				
			}else {
				double nomb = c1.getNumericCellValue();
				long p=(long)nomb;
				String value = String.valueOf(p);
				System.out.println(value);
			}
		}
		
	}

}
