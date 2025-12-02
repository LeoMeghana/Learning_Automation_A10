package LearnigDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class HandlingPropertiesFile {
	
	@Test(enabled=false)
	public void readData() throws IOException
	{
		//1.Convert Physical File into Java understandable file
		  FileInputStream fis=new FileInputStream("./src/test/resources/PropertyFiles/CommonData.properties");
		
		  //2.Create an Instance for Properties Class ,pass file
		  Properties  obj=new Properties();
		
		  //3.Load All the properties
		  obj.load(fis);//throws an IO Exception
		
		  //4.fetch data
		 System.out.println("UserName is:"+obj.getProperty("userName")); 
		 System.out.println("Password is:"+obj.getProperty("password"));
		 System.out.println("URL is:"+obj.getProperty("url"));
		 System.out.println("Data Fetched Succesfully!!");
		
	}
	//____________________________for Write Data_________________________________
	@Test(enabled=true)
	public void writeData() throws IOException
	{
		//1.convert physical file into java understandable File
		FileInputStream fis1 = new FileInputStream("./src/test/resources/PropertyFiles/CommonData.properties");
		
		//2. Create an INstance for Properties File
		Properties obj = new Properties();
		
		//3.LOad All the properties
		obj.load(fis1);
		
		//4.Write the data
		obj.put("Name", "Meghana");
		
		//5.create an Obj for FileOutPut stream
		FileOutputStream fos = new FileOutputStream("./src/test/resources/PropertyFiles/CommonData.properties");
		
		//6.for save data
		obj.store(fos,"Strored !!");
		
		System.out.println("Data Written");
	}

}
