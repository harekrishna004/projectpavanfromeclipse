package practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.DropDownObjects;
import resources.Base;

public class DropDownTest extends Base {
	
	public WebDriver d;
	DropDownObjects dd;
	
	@BeforeTest
	public void initialize() throws IOException {
		d=initializedDriver();
		d.get(prop.getProperty("url"));
		
	}
	
/*	@Test
	public void dropDownDemo() throws Exception {
		
		dd=new DropDownObjects(d);
		
		Select s=new Select(dd.dropDown());
		
//		s.selectByIndex(2);
//		
//		System.out.println(s.getFirstSelectedOption());
		
	List<WebElement> option=	s.getOptions();
	
	for(WebElement o :option) {
		
		String text=o.getText();
		
		System.out.println(text);
		if(text.equalsIgnoreCase("Fast")) {
			o.click();
			Thread.sleep(2000);
			Assert.assertEquals(text,"Fast");
		}
	}
		
		
		
	}   */
	
	@Test
	public void dropDownDemo() throws Exception {
		
		dd=new DropDownObjects(d);
		
		WebElement animal= dd.dropDownAnimals();
		dd.selectOptionFromDropdown(animal,"Baby Cat");
		
		WebElement speed= dd.dropDownSpeed();
		dd.selectOptionFromDropdown(speed,"Fast");
		
		WebElement number= dd.dropDownNumber();
		dd.selectOptionFromDropdown(number,"5");
		
		WebElement product= dd.dropDownProduct();
		dd.selectOptionFromDropdown(product,"Bing");
		
		WebElement file= dd.dropDownFiles();
		dd.selectOptionFromDropdown(file,"DOC file");
		
		
		

	}
	@AfterTest
	public void tearDown() {
		d.close();
	}
	
	
	

	

}
