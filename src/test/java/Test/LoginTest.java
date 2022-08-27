package Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "V:/SeleniumJars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.info("Opening the Url into the Browser");
		driver.get("https://www.google.com/gmail/about/");
	}
	
	@Test
	public void GmailTitle()
	{
		log.info("Verifying the gmail title.");
		String title = driver.getTitle();
		String expected = "Gmail: Private and secure email at no cost | Google Workspace";
		Assert.assertEquals(title, expected);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		log.error("Closing the Browser");
		driver.quit();
	}
}
