package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.ActionsObjects;
import resources.Base;

;

public class ActionsTest extends Base {
	
	public WebDriver d;
	ActionsObjects a;
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test(groups= {"smoke"})
	public void fileUploadDemo() throws Exception {
		
		a=new ActionsObjects(d);
		
		Actions act=new Actions(d);
		act.moveToElement(a.copyText()).doubleClick().perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(a.dragMe(), a.dropMe()).perform();;
		Thread.sleep(2000);
		
		
	}
	@Test(groups= {"smoke"})
	public void demo() {
		System.out.println("group practice");
	}
	
	@AfterTest
	public void tearDown() {
		d.close();
	}

}
