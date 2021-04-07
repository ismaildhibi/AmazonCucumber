package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usernamePage {

	WebDriver driver;
	private By emailfild = By.id("ap_email");

	public usernamePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public passwordPage setEmail(String username) {
	
		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(emailfild));
				element.sendKeys(username, Keys.ENTER);
				return new passwordPage(driver);

	}

}
