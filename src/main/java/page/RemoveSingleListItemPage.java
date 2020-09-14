package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleListItemPage {
	
	WebDriver driver;

	public RemoveSingleListItemPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@name='todo[2]']")
	WebElement SINGLE_LIST_ITEM_CHECKBOX;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;

	// Method to interact with the element
	public void clickSingleItemCheckBox() {
		SINGLE_LIST_ITEM_CHECKBOX.click();

	}

}
