package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.LoginPage;
import pomPages.passwordPage;
import pomPages.usernamePage;

public class LoginStepsPageFactory {
	WebDriver driver = null;
	LoginPage login;
	usernamePage user;
	passwordPage pass;	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		System.out.println("i'm a Given method: user on login page");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		 login = new LoginPage(driver);
			login.clicktobuttontologin();
	}

//	@When("user clicks on sign in")
//	public void user_clicks_on_sign_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user enter the (.*) and (.*)$")
	public void user_enter_the_ismaildhibi1_gmail_com_and_ismail124521(String username, String password) {
		
		
		user =new usernamePage(driver);
		user.setEmail(username);
		pass = new passwordPage(driver);
		pass.setpassword(password);
		
	}
	@Then("I should redirect to home page")
	public void i_should_redirect_to_home_page() {
	  System.out.println("go to home page");
	}


	

	

}
