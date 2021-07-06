package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerObjects {
	
	
	WebDriver d;
	public  DatePickerObjects(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(id="datepicker")
	WebElement datebox;
	
	private @FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement getmonth;
	
	private @FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement getmonthnext;
	
	private @FindBy(xpath="//a[@class='ui-state-default']")
	List<WebElement> getdate;
	
	//a[@class='ui-state-default']
	
	
	public WebElement dateBox()
	{
	  return datebox;
	  
	}
	  
	  
	  public WebElement getMonth()
		{
		  return getmonth;
		  
		}
	  
	  public WebElement getMonthNext()
		{
		  return getmonthnext;
		  
		}
	  public List<WebElement> getDate()
		{
		  return getdate;
		  
		}
		

}
