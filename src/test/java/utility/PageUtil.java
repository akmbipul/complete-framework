package utility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import testBase.Driverfactory;
import xPathLocators.HomePageXpath;
import xPathLocators.LoginPageXpath;

public class PageUtil extends Driverfactory {

	public HomePageXpath home = new HomePageXpath();
	public LoginPageXpath login = new LoginPageXpath();

	public boolean textValidation(String desiredText, String locatorOfActualElement) {
		try {// Validation Check the User is Mr
			String expectation = desiredText;
			String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
			if (expectation.equalsIgnoreCase(actual)) {
				System.out.println("Desired Text Match Actual Text");
				return true;
			} else {
				System.out.println("Test Failed Cause It Didnt Match text");
				return false;
			}
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean textNotValidate(String desiredText, String locatorOfActualElement) {

		try {
			// Validation Check the User is Mr
			String expectation = desiredText;
			String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
			if (expectation.equalsIgnoreCase(actual)) {
				System.out.println("Test passed Cause It Didnt Match text");
				return false;
			} else {
				System.out.println("Desired Text Match Actual Text...so its failed");
				return true;
			}
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			return false;
		}

	}

	public static void takeSnapShot(WebDriver driver, String fileWithPath) {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		//FileUtils.copyFile(SrcFile, DestFile);

	}

	public void wait(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		driver.close();
	}

}
