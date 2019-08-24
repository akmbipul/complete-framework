package stepDefination;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFunction.HomePageFunction;
import pageFunction.LogInFunction;
import utility.PageUtil;

public class LoginStep extends PageUtil {

	public HomePageFunction homef = new HomePageFunction();
	public LogInFunction loginf = new LogInFunction();

	@When("I start login with {string} and {string}")
	public void i_start_login_with_and(String email, String password) {
		homef.StartLogIn();
		loginf.logInProccess(email, password);
	}

	@Then("I should see {string}")
	public void i_should_see(String string) {

		assertEquals(textValidation("My Courses", home.myCourses), true);
	}
}
