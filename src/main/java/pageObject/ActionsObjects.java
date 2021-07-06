package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsObjects {
	
	WebDriver d;
	public  ActionsObjects(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(xpath="//button[contains(text(),'Copy Text')]")
	WebElement copytext;
	
	private @FindBy(xpath="//p[contains(text(),'Drag me to my target')]")
	WebElement dragme;
	private @FindBy(xpath="//p[contains(text(),'Drop here')]")
	WebElement dropme;
	
	
	
	
	public WebElement copyText()
	{
	  return copytext;
		
	}
	
	public WebElement dragMe()
	{
	  return dragme;
		
	}
	public WebElement dropMe()
	{
	  return dropme;
		
	}

}
