package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {

	WebDriver driver;
	
	private By buttoncreateAccount= By.xpath("//*[@id=\"nav-link-accountList\"]");
	private By buttoncreate= By.id("auth-create-account-link");
	private By txt_username= By.id("ap_customer_name");
	private By emailfild= By.id("ap_email");
	private By txt_passowrd= By.id("ap_password");
	private By txt_REpassowrd= By.xpath("//*[@id='ap_password']");
	private By btn_login= By.id("continue");


	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public usernamePage clicktobuttoncreateacount() {
		driver.findElement(buttoncreateAccount).click();
		return new usernamePage(driver);
	}
	public void clicktobuttoncreateacount1() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(buttoncreateAccount));
		element.click();

	}
	public void clicktobuttocreateyouraccount() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(buttoncreate));
		element.click();
		
	}
	public void setusername(String username) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(txt_username));
		element.sendKeys(username);
	}
	public void setemail(String email) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(emailfild));
		element.sendKeys(email);

	}	public void setpassword(String pass) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(txt_passowrd));
		element.sendKeys(pass);

	}	public void setrepassword(String repass) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(txt_REpassowrd));
		element.sendKeys(repass);	
	}
	public void clicktosave() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(btn_login));
		element.click();

	}

	
}
