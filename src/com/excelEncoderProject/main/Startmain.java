package com.excelEncoderProject.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.excelEncoderProject.dao.impl.simpleCount;
import com.excelEncoderProject.loader.excelLoader;

public class Startmain {

	public static void main(String[] args) {
		
	ArrayList buffer=new ArrayList();
		String inputFilename = "D:/Users/ibrahims/Downloads/finalsheet.xlsx";
		
		excelLoader excelload=new excelLoader();
		try {
		buffer=	excelload.readXLSFile(inputFilename);
		System.out.println("Request got completed successfully");
	
	
		//System.out.println(buffer.toString()+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// TODO Auto-generated method stub
		
	
	}
	/*public void readingBuffer(StringBuffer buffer) {
		
		buffer.
		
		
		
	}
*/
}
