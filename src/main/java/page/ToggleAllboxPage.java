package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllboxPage {
	
WebDriver driver;
	
	public ToggleAllboxPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") 
	WebElement TOGGLE_ALL_BOX_FIELD;
	
	// Method to interact with the element
		public void clickToggleAllBoxField() {
			TOGGLE_ALL_BOX_FIELD.click();

}

}
