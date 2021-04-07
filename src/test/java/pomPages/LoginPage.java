package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	
	WebDriver driver;
	private By signinbutton= By.id("nav-link-accountList-nav-line-1");

	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public usernamePage clicktobuttontologin() {
		driver.findElement(signinbutton).click();
		return new usernamePage(driver);
	}
}
