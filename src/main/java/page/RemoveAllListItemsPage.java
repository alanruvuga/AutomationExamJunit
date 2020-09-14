package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllListItemsPage {
	WebDriver driver;

	public RemoveAllListItemsPage(WebDriver driver) {

		this.driver = driver;
	}
	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") 
	WebElement SELECT_ALL_BOX_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_ALL_BUTTON;

	// Method to interact with the element
	
	public void selectAllButton() {
		SELECT_ALL_BOX_FIELD.click();
		
	}
	public void clickRemoveButton() {
		REMOVE_ALL_BUTTON.click();

		// ToggleAllboxPage ToggleAllCheckBox = PageFactory.initElements(driver,
		// ToggleAllboxPage.class);
		// ToggleAllCheckBox.clickToggleAllBoxField();

	}


}
