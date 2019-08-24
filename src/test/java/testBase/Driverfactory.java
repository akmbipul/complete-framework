package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverfactory {

	 public static WebDriver driver;
		
		public WebDriver launcher(String browserType,String URL) {
			System.setProperty("webdriver.chrome.driver","drivers\\windows\\chromedriver.exe");
			// Create the Driver 
			if (browserType.equalsIgnoreCase("chrome")){
				driver = new ChromeDriver();
				driver.navigate().to("http://www.google.com");
				driver.manage().window().maximize();
				driver.navigate().to(URL);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
			} else if(browserType.equalsIgnoreCase("mozilla")) {
				driver = new FirefoxDriver();
				driver.navigate().to("http://www.google.com");
				driver.manage().window().maximize();
				driver.navigate().to(URL);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
			} else if(browserType.equalsIgnoreCase("ie")) {
				driver = new InternetExplorerDriver();
				driver.navigate().to("http://www.google.com");
				driver.manage().window().maximize();
				driver.navigate().to(URL);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			}
			
			else {
				System.out.println("Not A valid Driver !!!!");
			}
			
			// go to the application
			
			return driver;
			
		}
		
}
