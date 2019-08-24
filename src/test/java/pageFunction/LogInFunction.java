package pageFunction;

import org.openqa.selenium.By;

import utility.PageUtil;


public class LogInFunction extends PageUtil {

	
	
	public void logInProccess(String email, String password) {

		driver.findElement(By.xpath(login.email)).sendKeys(email);
		driver.findElement(By.xpath(login.password)).sendKeys(password);
		driver.findElement(By.xpath(login.logInButton)).click();

	}

}
