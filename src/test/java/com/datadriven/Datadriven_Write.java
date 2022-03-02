package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void write_data() throws Throwable {
		
		File f = new File("C:\\Users\\infan\\eclipse-workspace\\Maven_Project\\DD-Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("Data");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Personal Details");
		
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("First Name");
		
		w.getSheet("Data").getRow(0).createCell(2).setCellValue("Last Name");
		
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("My Name");
		
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("Vinod.A.");
		
		w.getSheet("Data").getRow(1).createCell(2).setCellValue("Ranjith");
				
		w.getSheet("Data").createRow(2).createCell(0).setCellValue("Father's Name");
		
		w.getSheet("Data").getRow(2).createCell(1).setCellValue("Vincent");
		
		w.getSheet("Data").getRow(2).createCell(2).setCellValue("Nicolas");
				
		w.getSheet("Data").createRow(3).createCell(0).setCellValue("Mother's Name");
		
		w.getSheet("Data").getRow(3).createCell(1).setCellValue("Hariet");
		
		w.getSheet("Data").getRow(3).createCell(2).setCellValue("Mary");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		w.close();
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_data();
		
	}

}
