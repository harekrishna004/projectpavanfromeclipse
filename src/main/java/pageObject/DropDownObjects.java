package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownObjects {

	WebDriver d;

	public DropDownObjects(WebDriver d) {

		this.d = d;
		PageFactory.initElements(d, this);

	}

	private @FindBy(id = "speed") WebElement dropdownspeed;

	private @FindBy(id = "files") WebElement dropdownfiles;

	private @FindBy(id = "number") WebElement dropdownnumber;

	private @FindBy(id = "products") WebElement dropdownproduct;

	private @FindBy(id = "animals") WebElement dropdownanimal;

	public WebElement dropDownSpeed() {

		return dropdownspeed;
	}

	public WebElement dropDownFiles() {

		return dropdownfiles;
	}

	public WebElement dropDownNumber() {

		return dropdownnumber;
	}

	public WebElement dropDownProduct() {

		return dropdownproduct;
	}

	public WebElement dropDownAnimals() {

		return dropdownanimal;
	}

	public static void selectOptionFromDropdown(WebElement ele,String value) {
		
		Select drp=new Select(ele);
			List<WebElement> option=drp.getOptions();
			  
			  for(WebElement o:option) {
				  if(o.getText().equals(value))
				  {
					  o.click();
					  break;
				  }
				 
		}

}}
