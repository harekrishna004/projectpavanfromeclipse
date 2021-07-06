package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderObject {
	
	WebDriver d;
	public  SliderObject(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(xpath="//div[@id='slider']/span")
	WebElement slider;
	
	
	public WebElement sliderDemo()
	{
	  return slider;
		
	}

}
