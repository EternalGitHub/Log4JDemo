package Test;

import org.openqa.selenium.WebDriver;

public class LogoDisplayed 
{

	WebDriver driver;
	public LogoDisplayed(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("Logo is Displayed..");
	}
}
