package LearnigDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HandlingExcelFile {
	@Test(enabled=false)//for diasbling this method
	public void readData() throws IOException
	{
		
		//1.Convert physical file into java understandable file
		//try {
			//FileInputStream fis=new FileInputStream(" ");
		//} catch (FileNotFoundException e) {
			// TODO: handle exception
			//e.printStackTrace();
		//}
		//_______________________________________________________________
		
		FileInputStream fis=new FileInputStream("./src/test/resources/SeleniumBatch.xlsx/");
		
		//2.Create workbook using WorkBook(interface) Factory
		Workbook book=WorkbookFactory.create(fis);//throws IO Exception
		//pkgs should come from apachipoiss usermodel
		
		//3.Fetch the data
		
		System.out.println(book.getSheet("A10").getRow(1).getCell(0).getStringCellValue());
	}
		
		//______________________Write DATA__________________
	Scanner sc=new Scanner(System.in);
		@Test
		public  void writeData() throws EncryptedDocumentException, IOException
		{
			System.out.println("Enter Column Names");
			
		//1.Convert Physical file into java understandable file
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumBatch.xlsx");
		//2.Create WorkBook using WorkBookFactory
		Workbook book=WorkbookFactory.create(fis);
		//3.Write data
		for(int col=0;col<=2;col++)
		{
			String colNames=sc.next();
		book.createSheet("A3").createRow(0).createCell(col).setCellValue(colNames);//createRow(1).createCell(0).setCellValue("Meghana");
		}
		//_______________________________
		System.out.println("Enter Student Names");
		for(int i=1;i<=5;i++)//for names
		{
		String names=sc.next();
		book.getSheet("A3").createRow(i).createCell(0).setCellValue(names);
		
		}
		System.out.println("Enter PhoneNumbers");
		for(int j=1;j<=5;j++)//foe numbers
		{
			long num=sc.nextLong();
			book.getSheet("A3").createRow(j).createCell(0).setCellValue(num);
		}
		//_____________________________
		
		//4.Convert java file to phisical file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/SeleniumBatch.xlsx");
		//5.Write or save the data
		book.write(fos);
		//6.Close the Workbook
		book.close();
		System.out.println("Data Entered Successfully!!!");
		}
}

		
	


