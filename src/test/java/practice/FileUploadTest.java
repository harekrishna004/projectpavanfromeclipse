package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AlertDemoObjects;
import pageObject.FileUploadObjects;
import resources.Base;

public class FileUploadTest extends Base {
	public WebDriver d;
	FileUploadObjects f;
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void fileUploadDemo() throws Exception {
		
		f=new FileUploadObjects(d);
		f.fileUpload().sendKeys("C:\\Users\\Hare Krishna\\Downloads\\Appointment_slip.pdf");
		
	}
//	@AfterTest
//	public void tearDown() {
//		d.close();
//	}
		
}
