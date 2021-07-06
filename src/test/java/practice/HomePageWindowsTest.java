package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.MainPageMultipleWindowsObjects;
import resources.Base;
//import resources.Base;


public class HomePageWindowsTest extends Base {
	
	
	
	public WebDriver d;
	MainPageMultipleWindowsObjects m;

	//private static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws Exception {
		d=initializedDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void windowsMultiple() throws Exception {
		
		 m=new MainPageMultipleWindowsObjects(d);
		
		m.textBox().sendKeys("india");
		//Thread.sleep(2000);
		m.searchBox().click();
		Thread.sleep(2000);
		
	List<WebElement> a=	m.searchList();
		int size=m.searchList().size();
		System.out.println(size);
		
	for(int i=0;i<size;i++) {
		String text=a.get(i).getText();
		//String atr=a.get(i).getAttribute("target");
		
		System.out.println(text);
		
		m.linkclick().click();
		
//        if(text.equals("Indian Idol")) {
//			
//			a.get(i).click();
//			Thread.sleep(2000);
//			break;
//		
//		}
		
		
		Set<String> windows= d.getWindowHandles();
		System.out.println("all windows :-- "+windows);
		Iterator<String> it= windows.iterator();
		
		String Parentid=it.next();
		System.out.println("parent window id----"+Parentid);
		
		String Childid=it.next();
		System.out.println("child window id-----"+Childid);
		
		d.switchTo().window(Childid);
		System.out.println(d.getTitle());
		d.close();
		
		d.switchTo().window(Parentid);
		System.out.println(d.getTitle());
		
		
		
		
	}
	
		
		
	}
	@AfterTest
	public void tearDown() {
		d.close();
	}

}
