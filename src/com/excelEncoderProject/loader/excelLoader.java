package com.excelEncoderProject.loader;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelEncoderProject.dao.impl.simpleCount;
import com.excelEncoderProject.model.excelLoad;
import com.excelEncoderProject.model.initialLoad;

public class excelLoader {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
	simpleCount initialLoad = (simpleCount)context.getBean("simplecountBean",simpleCount.class);
	excelLoad eLoad = new excelLoad();

	public ArrayList readXLSFile(String inputFilename) throws IOException
	{ StringBuffer buffer= new StringBuffer();
		Workbook workbook = null;
		   FileInputStream inputStream = null;
		   ArrayList collectData = new ArrayList() ;
		   
	
		try 
		{
		
		
		     inputStream = new FileInputStream(new File(inputFilename));
		         
		         workbook = new XSSFWorkbook(inputStream);
		        Sheet firstSheet = workbook.getSheetAt(0);
		       
		        Iterator<Row> iterator = firstSheet.iterator();
		         
		        while (iterator.hasNext()) {
		            Row nextRow = iterator.next();
		            Iterator<Cell> cellIterator = nextRow.cellIterator();
		             
		            while (cellIterator.hasNext()) {
		                Cell cell = cellIterator.next();
		                 
		                switch (cell.getCellType()) {
		                    case Cell.CELL_TYPE_STRING:
		                     //  System.out.print(cell.getStringCellValue());
		                    	
		                    			collectData.add(cell.getStringCellValue());
		                    
		                    		
		                        break;
		                    case Cell.CELL_TYPE_BOOLEAN:
		                    //   System.out.print(cell.getBooleanCellValue());
		                      
		                        break;
		                    case Cell.CELL_TYPE_NUMERIC:
		                    // System.out.print(cell.getNumericCellValue());
		                      
		                        break;
		                }
		         
		              
		              
		            }
		            eLoad.setId(2);
	               
	                eLoad.setIncident(collectData.get(0).toString());
	               
	                
	                String title = collectData.get(1).toString();
	                eLoad.setTitle(title);
	                
	               
	                eLoad.setStatus(collectData.get(2).toString());
	                
	                eLoad.setUrgency(collectData.get(3).toString());
	               
	                eLoad.setPriority(collectData.get(4).toString());
	               
	               
	                
	
	                eLoad.setAG(collectData.get(5).toString());
	                
	                eLoad.setAssignee(collectData.get(6).toString());
	              
	                initialLoad.saveExceltoDisk(eLoad);
		          collectData.clear();
		        }
		       
		       
		           
		}catch(Exception e) {
		        try {
					workbook.close();
					inputStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		       	        
	}
		 return collectData;
	}
}
