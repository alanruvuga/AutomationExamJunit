package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Util.BrowserFactory;
import page.RemoveButtonPage;
import page.RemoveSingleListItemPage;

public class RemoveSingleListItemTest {
	
	WebDriver driver;

	public void RemoveSingleListItem() {

		driver = BrowserFactory.launchBrowser();

		RemoveSingleListItemPage RemoveSingleListItem = PageFactory.initElements(driver,
				RemoveSingleListItemPage.class);
		RemoveButtonPage remove = PageFactory.initElements(driver, RemoveButtonPage.class);

		RemoveSingleListItem.clickSingleItemCheckBox();
		remove.clickRemoveButton();

	}

}
