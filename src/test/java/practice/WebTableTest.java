package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.WebTableObjects;
import resources.Base;

public class WebTableTest extends Base {
	
	public WebDriver d;
	WebTableObjects w;
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void alertDemo() throws Exception {
		
		w=new WebTableObjects(d);
		//to get no. of rows
		int rows=w.noOfRows().size();
		System.out.println(rows);
		
		//to get no. of collumns
		
		int collumns=w.noOfCollumns().size();
		System.out.println(collumns);
		
		//to print all text 
		//table[@name='BookTable']/tbody/tr[2]/td[1]
		
		//table[@name='BookTable']/tbody/tr[2]/td[1]
		
		for(int r=2;r<=rows;r++) {
	   		   for(int c=1;c<=collumns;c++) {
	   			String value=	d.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]/td["+c+"]")).getText();
	   		
	   	   	   System.out.print(value+"     ");
	   			   
	   		   }
	   		   System.out.println();
	   	   }     
		
	}
	
	@AfterTest
	public void tearDown() {
		d.close();
	}

}
