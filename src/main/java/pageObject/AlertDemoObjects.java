package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertDemoObjects {
	
	
	WebDriver d;
	public  AlertDemoObjects(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(xpath="//button[text()='Click Me']")
	WebElement alertbutton;
	
	
	public WebElement alertButton()
	{
	  return alertbutton;
		
	}

}
