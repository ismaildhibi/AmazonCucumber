package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.CreateAccount;

public class CreateAcounte_stepsPage {
	WebDriver driver ;
	CreateAccount account;
	
	@Given("go to amazone page")
	public void go_to_amazone_page() {

		WebDriverManager.chromedriver().setup();
		System.out.println("i'm a Given method: user on login page");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");	
		
		 
	}

	@And("click to sign in page")
	public void click_to_sign_in_page() {
		account = new CreateAccount (driver);
		account.clicktobuttoncreateacount();
	    
	}

	@And("click to create accounte button")
	public void click_to_create_accounte_button() {	
		account = new CreateAccount (driver);
		account.clicktobuttocreateyouraccount();
	}

	@And("add (.*)&(.*)&(.*)&(.*)$\"")
	public void add_username_email_password_repassword(String username, String password,String email, String repassword) {
		account = new CreateAccount (driver);
		account.setemail(email);
		account.setusername(username);;
		account.setpassword(password);
		account.setrepassword(repassword);
	
	}

	@And("click on button  create account")
	public void click_on_button_create_account() {
		account = new CreateAccount (driver);
		account.clicktosave();
	}

	@Then("go to page home")
	public void go_to_page_home() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
