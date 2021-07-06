package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableObjects {
	
	WebDriver d;
	
	public WebTableObjects(WebDriver d) {
		
		this.d=d;
		
		PageFactory.initElements(d, this);
	}
	
	private @FindBy(xpath="//table[@name='BookTable']//tr")
	List<WebElement> rows;
	
	private @FindBy(xpath="//table[@name='BookTable']/tbody/tr/th")
	List<WebElement> collumns;
	
	
	
	//table[@name='BookTable']/tbody/tr[2]/td[1]
	
	
	
	public List<WebElement> noOfRows() {
		return rows;
	}
	
	public List<WebElement> noOfCollumns() {
		return collumns;
	}
	
//	public WebElement allText() {
//		return alltext;
//	}

}
