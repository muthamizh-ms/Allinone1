package hybridDrivenFramework;

import java.io.File;
import java.io.IOException;

import genericWrapper.ListOfActions;

import java.io.*;
import jxl.*;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DriverScript {
	public static File StoreProcess;
	public static Workbook scenarioWorkBook;
	public static Sheet Functions;
	public static int rowCount;
	public static int columnCount;
	public static String flag="";		// AccountCreation
	public static String keyword="";
	public static String datas="";
	
		public static void main(String[] args) throws IOException, InterruptedException, BiffException {
			//StoreProcess=new File("./src/test/java/com/AllinOne/externalSource/StoreProcesseurope.xls");
			StoreProcess=new File("C:\\Selenium\\StoreProcess.xls");
			//C:\Eclipse\Testing Files\AllinOne\src\test\java\com\AllinOne\externalSource\StoreProcesseurope.xls
			scenarioWorkBook= Workbook.getWorkbook(StoreProcess);
			Functions=scenarioWorkBook.getSheet("Functions");
			rowCount=Functions.getRows();
			columnCount=Functions.getColumns();
			//Perform List of scenarios = row navigation Loop
					
			for(int currentRow=1;currentRow<rowCount;currentRow++)
			{
				try
				{
					//Select the columns to perform
					flag=Functions.getCell(1, currentRow).getContents();
					if(flag.equalsIgnoreCase("yes")||flag.toLowerCase().contains("y"))
					{
						//Perform List of Steps for the scenarios = Column Navigation Loop
						for(int currentColumn=2;currentColumn<columnCount;currentColumn++)
						{
							keyword=Functions.getCell(currentColumn, currentRow).getContents();
							datas=Functions.getCell(++currentColumn, currentRow).getContents();
							System.out.println(keyword);
							System.out.println(datas);
							Thread.sleep(4000);
							ListOfActions.selectStep(keyword, datas);
						}			
					}  
				
				}	
				catch (Exception em)
				{
					System.out.println(em);
					
					
				}
			}
			
			}
			}
