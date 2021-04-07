package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class passwordPage {
	WebDriver driver;
	private By password= By.id("ap_password");

	
	public HomePageAmazon setpassword(String addpassword) {
		driver.findElement(password).sendKeys(addpassword,Keys.ENTER);
		return new HomePageAmazon(driver);
		

	}


	public passwordPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

}
