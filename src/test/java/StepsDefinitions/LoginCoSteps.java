package StepsDefinitions;

import com.redsea.base.Base;
import com.Pages.LoginCoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class LoginCoSteps extends Base {
    LoginCoPage loginPage;

    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() throws IOException {

         //lunchBrowser();
    }



    @When("User fill email as {string} and pw as {string}")
    public void userFillEmailAsAndPwAs(String username, String password) {

        loginPage = new LoginCoPage();
        loginPage.performLogin(username, password);

    }

    @When("click on login button")
    public void click_on_login_button() {
        //  driver.findElement(By.name("login")).click();

    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {
        System.out.println("welcome page ");

    }

}
