package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AlertDemoObjects;
import resources.Base;

public class AlertPracticeTest extends Base {
	
	public WebDriver d;
	AlertDemoObjects a;
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void alertDemo() throws Exception {
		a=new AlertDemoObjects(d);
		a.alertButton().click();
		
	String text=	d.switchTo().alert().getText();
	System.out.println(text);
	
	Thread.sleep(2000);
	
	d.switchTo().alert().accept();
		
	}
	
	
	@AfterTest
	public void tearDown() {
		d.close();
	}
	
	

}
