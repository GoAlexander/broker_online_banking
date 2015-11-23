/*package backend;

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
	 * 
	 * -----
	 * public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("/tmp/1.xls");
        HSSFWorkbook wb = new HSSFWorkbook(in);
 
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "=");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print("[" + cell.getNumericCellValue() + "]");
                        break;
 
                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print("[" + cell.getNumericCellValue() + "]");
                        break;
                    default:
                        System.out.print("|");
                        break;
                }
            }
            System.out.println();
        }
    }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*public static void readtest() throws Exception {
		//Achtung! Придумать другой путь к xls!!! 
		
		//Achtung! Проверять строчку НБД банка!!!
		InputStream in = new FileInputStream("/home/alexander/Files/Workspaces/eclipse/broker_online_banking/DBexcel/физ_лица.xls");
		
		
		HSSFWorkbook wb = new HSSFWorkbook(in);
		ExcelExtractor extractor = new ExcelExtractor(wb);
		//extractor.setFormulasNotResults(false); // Считать формулы
		//extractor.setIncludeSheetNames(true); //зачем?
		String text = extractor.getText();
		
		
		System.out.println(text);
		
		//cell output

        //Cell cell = cells.next();  
        //System.out.print(cell.getStringCellValue());
		
		//CellReference cellReference = new CellReference("B3"); 
		//Row row = sheet.getRow(cellReference.getRow());
		//Cell cell = row.getCell(cellReference.getCol()); 
		

	}

}*/
