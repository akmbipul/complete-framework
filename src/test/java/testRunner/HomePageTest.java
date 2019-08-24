package testRunner;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pageFunction.HomePageFunction;
import pageFunction.LogInFunction;
import utility.Hooks;


public class HomePageTest extends Hooks {

	public HomePageFunction homef = new HomePageFunction();
	public LogInFunction loginf = new LogInFunction(); 
	
	
	@Test(groups = "Smoketest")
	public void testlogIn() {
		homef.StartLogIn();
		loginf.logInProccess("nightgroup@gmail.com","night123");
		assertEquals(textValidation("My Courses",home.myCourses), true);
	}
	
}
