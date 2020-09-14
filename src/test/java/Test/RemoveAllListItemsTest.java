package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllListItemsPage;

public class RemoveAllListItemsTest {
	
WebDriver driver;
	
	@Test
	public void RemoveAlllistItems() {
		
		driver = Util.BrowserFactory.launchBrowser();
		
		RemoveAllListItemsPage removealllistitems = PageFactory.initElements(driver, RemoveAllListItemsPage.class);
		removealllistitems.selectAllButton();
		removealllistitems.clickRemoveButton();
		

	}

}
