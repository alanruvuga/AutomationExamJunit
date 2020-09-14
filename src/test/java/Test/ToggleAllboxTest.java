package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Util.BrowserFactory;
import page.ToggleAllboxPage;

public class ToggleAllboxTest {
	
WebDriver driver;
	
	
	@Test
	public void ClickOnToggleAllBox(){
		
		driver = BrowserFactory.launchBrowser();
		ToggleAllboxPage ToggleAllBox = PageFactory.initElements(driver, ToggleAllboxPage.class);
		 ToggleAllBox.clickToggleAllBoxField();
		
	}
}
