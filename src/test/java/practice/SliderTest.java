package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.ActionsObjects;
import pageObject.SliderObject;
import resources.Base;

public class SliderTest extends Base {
	
	public WebDriver d;
	SliderObject s;
	
	@BeforeTest
	public void initialize() throws Exception {
		
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void slideDemo() throws Exception {
		
		s=new SliderObject(d);
		
		Actions a=new Actions(d);
		
		System.out.println(s.sliderDemo().getLocation());
		
		a.dragAndDropBy(s.sliderDemo(), 200, 0).perform();
	}
	@AfterTest
	public void TearDown() {
		d.close();
	}
}