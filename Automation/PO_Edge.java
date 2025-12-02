package Automation;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PO_Edge {
	public static void main(String[] args) {
		
		//configuring driver exucutable file
		WebDriverManager.edgedriver().setup();
		
		//launching the browser
		EdgeDriver driver=new EdgeDriver();
	}

}
