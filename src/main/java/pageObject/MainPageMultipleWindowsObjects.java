package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageMultipleWindowsObjects {
	
	WebDriver d;
	public  MainPageMultipleWindowsObjects(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(id="Wikipedia1_wikipedia-search-input")
	WebElement textbox;
	
	private @FindBy(className="wikipedia-search-button")
	WebElement search;
	
	private @FindBy(className="wikipedia-search-results")
	List<WebElement> searchresult;
	
	private @FindBy(linkText="India")
	WebElement indialink;
	
	
	
	
	
	
	public WebElement textBox()
	{
	  return textbox;
		
	}
	
	public WebElement searchBox() {
		return search;
	}
	
	public List<WebElement> searchList(){
		return searchresult;
	}
	public WebElement linkclick() {
		return indialink;
	}
	
	

}
