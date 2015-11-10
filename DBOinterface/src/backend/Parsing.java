package backend;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.InputStream;
//import java.util.Iterator;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//для чего ss ??

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;

//Добавить xmlbeans.jar ???

public class Parsing {
	public static void test() {
		System.out.println("Test");
	}

	// Этот парсинг работает ТОЛЬКО с xls
	/*
	 * public static void readFromExcel(String file) { HSSFWorkbook myExcelBook
	 * = new HSSFWorkbook(new FileInputStream(file)); HSSFSheet myExcelSheet =
	 * myExcelBook.getSheet("Birthdays"); HSSFRow row = myExcelSheet.getRow(0);
	 * 
	 * if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){ String
	 * name = row.getCell(0).getStringCellValue(); System.out.println("name : "
	 * + name); }
	 * 
	 * if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){ Date
	 * birthdate = row.getCell(1).getDateCellValue(); System.out.println(
	 * "birthdate :" + birthdate); }
	 * 
	 * myExcelBook.close();
	 * 
	 * 
	 * //XSSFWorkBook, XSSFSheet, XSSFRow
	 * 
	 */

	public static void readtest() throws Exception {
		//Achtung! Придумать другой путь к xls!!! 
		InputStream in = new FileInputStream("/home/alexander/Files/Workspaces/eclipse/broker_online_banking/DBexcel/физ_лица.xls");
		
		
		HSSFWorkbook wb = new HSSFWorkbook(in);
		ExcelExtractor extractor = new ExcelExtractor(wb);
		extractor.setFormulasNotResults(false); // Считать формулы
		extractor.setIncludeSheetNames(true);
		String text = extractor.getText();

		System.out.println(text);

	}

}
