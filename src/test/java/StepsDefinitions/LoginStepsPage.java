package StepsDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import com.Pages.LoginPage;
import com.redsea.base.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsPage extends Base {
	LoginPage login;

	@Given("the user is on login page")
	public void the_user_is_on_login_page() throws IOException {

		lunchdriver();

	}

	@When("the user enter username {string} and password {string}")
	public void user_enter_the_ismaildhibi1_gmail_com_and_ismail124521(String arg1 , String arg2) {

		login = new LoginPage(driver);
		login.enterUsername(arg1);
		login.enterPassword(arg2);
		login.clickLogin();
	}

	@Then("I should redirect to Workforce page")
	public void i_should_redirect_to_Workforce_page() {

		String messsage = login.getText();
		Assert.assertEquals((messsage), "WORKFORCE");
		System.out.println("i'm a Then method: user navigated dashboard");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String expectedUrl = "http://tt-qa.dev-machinestalk.com/workforce";
		System.out.println(driver.getTitle());
		Assert.assertEquals("not equal", expectedUrl, currentUrl);

	}

	@When("user enter (.*) and the (.*)$")
	public void user_enter_ismaildhibi1_gmail_com_and_the_ismail124521(String username, String password) {

		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {

		String messsage = login.getTextErrorMessage();
		Assert.assertEquals((messsage), "Invalid username or password.");

	}

	@When("user click to forget password button")
	public void user_click_to_forget_password_button() throws InterruptedException {
		login = new LoginPage(driver);
		login.clickToResetPassword();

	
		Thread.sleep(3000);

	}

	@And("I should redirect Forgot password page")
	public void i_should_redirect_forgot_password_page() throws InterruptedException {
		String messsage = login.getTextRestpassword();
		Assert.assertEquals((messsage), "Forgot password?");
	


	}

@And("user enter  invalid tenant@mt.co and click to submit")
public void user_enter_invalid_tenant_mt_co_and_click_to_submit(String email) throws InterruptedException {
		login = new LoginPage(driver);
		login.setEmailinForgetpasswordpage(email);
		Thread.sleep(2000);
		login.clicktosubmitemail();

	}

	@Then("an error message should be displayed in page")
	public void an_error_message_should_be_displayed_in_page() {
			String messsage = login.getTexterrorRestpassword();
			Assert.assertEquals((messsage), "Invalid email address.");
		


	}
}
