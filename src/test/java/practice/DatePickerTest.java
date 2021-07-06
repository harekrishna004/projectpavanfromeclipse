package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AlertDemoObjects;
import pageObject.DatePickerObjects;
import resources.Base;

public class DatePickerTest extends Base {
	
	public WebDriver d;
	DatePickerObjects c;
	
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void date() throws Exception {
		
		c=new DatePickerObjects(d);
		c.dateBox().click();
		
		 //to get the month
		  while(!c.getMonth().getText().contains("November"))
			  
		  {
			 c.getMonthNext().click();
			
		 } 
		  
		  List<WebElement> date= c.getDate();
			int count= c.getDate().size();
			//System.out.println(count);
			for(int i=0;i<count;i++) {
			String text=c.getDate().get(i).getText();
			//System.out.println(text);
				if(text.equalsIgnoreCase("20"))
				{
					c.getDate().get(i).click();
					Thread.sleep(2000);
					break;
					
				}
				
				
			}
		
	}
	
	@AfterTest
	public void tearDown() {
		
		d.close();
	}

}
