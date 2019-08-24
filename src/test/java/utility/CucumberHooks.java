package utility;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import utility.PageUtil;

public class CucumberHooks extends PageUtil {

	@Given("I open {string}and go to {string}")
	public void i_open_and_go_to(String browser, String URL) {

		launcher(browser, URL);
	}

	@After
	public void tearDown() {
		close();
	}
}
