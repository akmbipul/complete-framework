package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends PageUtil {

	@BeforeMethod
	public void launchBrowser() {
		launcher("chrome", "https://letskodeit.teachable.com/");

	}

	@AfterMethod

	public void teardown() {
		wait(2000);
		close();
	}

}
