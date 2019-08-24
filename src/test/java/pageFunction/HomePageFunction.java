package pageFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.PageUtil;


public class HomePageFunction extends PageUtil {

	

	public void StartLogIn() {
		
		driver.findElement(By.xpath(home.logIn)).click();
	}

	public void logOuit() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement logOut = driver.findElement(By.xpath(home.logout));

	 driver.findElement(By.xpath(home.profileDropDown)).click();
	 wait(2000);
	 wait.until(ExpectedConditions.elementToBeClickable(logOut)).click();

		
	}
	public void validateProfile(String desiredText) {

		textNotValidate(desiredText, home.myCourses);
		

	}
}
