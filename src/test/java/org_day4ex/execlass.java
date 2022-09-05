package org_day4ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class execlass {
	public static void main(String[] args) throws IOException {
		
        File f=new File("C:\\Users\\91805\\eclipse-workspace\\MavenProject\\src\\test\\resources\\sheet1.xlsx");
						
				FileInputStream f1=new FileInputStream(f);		
				
		Workbook w=new XSSFWorkbook(f1);
		
		Sheet s1 = w.getSheet("sheet1");
		    
		for (int j = 0; j < s1.getPhysicalNumberOfRows(); j++) {
		Row r = s1.getRow(j);
		
		
		for (int i = 0; i<r.getPhysicalNumberOfCells(); i++) {
		Cell c1 = r.getCell(i);
		System.out.println(c1);
		}System.out.println("===============");}
				
				
	}

}
