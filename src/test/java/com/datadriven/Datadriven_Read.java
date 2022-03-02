package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

//Read Particular Data
	public static void read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\infan\\eclipse-workspace\\Maven_Project\\DD-Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType.equals(CellType.NUMERIC)) {
		
			double value = cell.getNumericCellValue();
			int n = (int) value;
			System.out.println(n);
		}
	}
	
	//Read All Data
	public static void read_All_Data() throws Throwable {
		
        File f = new File("C:\\Users\\infan\\eclipse-workspace\\Maven_Project\\DD-Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		
		int noOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {	
		Row row = sheetAt.getRow(i);
			
			int noOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < noOfCells; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int n = (int) value;
					System.out.println(n);		
				}
			}	
		}
	}
	
	//Read Particular Row Data
	public static void read_Particular_Row_Data() throws Throwable {
		
		File f = new File("C:\\Users\\infan\\eclipse-workspace\\Maven_Project\\DD-Read.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(fis);
				Sheet sheetAt = w.getSheetAt(0);
				
				int noOfRows = sheetAt.getPhysicalNumberOfRows();
				for (int i = 0; i < noOfRows; i++) {
				Row row = sheetAt.getRow(i);
				
				Cell cell = row.getCell(0);
						
						CellType cellType = cell.getCellType();
						
						if (cellType.equals(CellType.STRING)) {
							String value = cell.getStringCellValue();
							System.out.println(value);
						}
						else if (cellType.equals(CellType.NUMERIC)) {
							double value = cell.getNumericCellValue();
							int n = (int) value;
							System.out.println(n);		
						}
					}
				}
	
	//Read Particular Column Data
	public static void read_Particular_Column_Data() throws Throwable {
		
		File f = new File("C:\\Users\\infan\\eclipse-workspace\\Maven_Project\\DD-Read.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(fis);
				Sheet sheetAt = w.getSheetAt(0);
				
				Row row = sheetAt.getRow(1); 
					int noOfCells = row.getPhysicalNumberOfCells();
					for (int j = 0; j < noOfCells; j++) {
						Cell cell = row.getCell(j);
						
						CellType cellType = cell.getCellType();
						if (cellType.equals(CellType.STRING)) {
							String value = cell.getStringCellValue();
							System.out.println(value);
						}
						else if (cellType.equals(CellType.NUMERIC)) {
							double value = cell.getNumericCellValue();
							int n = (int) value;
							System.out.println(n);		
						}
					}	
				}
	
	public static void main(String[] args) throws Throwable {
		
		System.out.println("Read Particular Data");
		read_Particular_Data();
		
		System.out.println("\n Read All Data");
		read_All_Data();
		
		System.out.println("\n Read Particular Row Data");
		read_Particular_Row_Data();
		
		System.out.println("\n Read Particular Column Data");
		read_Particular_Column_Data();
	}
}
