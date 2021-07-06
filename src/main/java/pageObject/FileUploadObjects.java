package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadObjects {
	
	
	WebDriver d;
	public  FileUploadObjects(WebDriver d) 
	{
		
		this.d=d;
		PageFactory.initElements(d,this);

	}
	
	private @FindBy(xpath="//input[@class='file_upload']")
	WebElement fileupload;
	
	
	public WebElement fileUpload()
	{
	  return fileupload;
		
	}

}
