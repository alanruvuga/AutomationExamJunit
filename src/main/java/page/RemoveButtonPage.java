package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButtonPage {
	
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;
	
	// Method to interact with the element
		public void clickRemoveButton() {
			REMOVE_BUTTON.click();

		}

}
