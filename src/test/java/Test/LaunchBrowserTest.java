package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Util.BrowserFactory;

public class LaunchBrowserTest {
	
	WebDriver driver;

	@Test
	public void OpenBrowser() {
		driver = BrowserFactory.launchBrowser();

		// BrowserFactory.tearDown();
	}

}
