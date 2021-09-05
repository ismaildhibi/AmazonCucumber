package StepsDefinitions;

import com.Pages.LoginPage;
import com.Pages.UserPage;
import com.redsea.base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edite_User extends Base {

    LoginPage login;
    UserPage user;

    @When("click to button settnigs  and click to button user")
    public void click_to_button_settnigs_and_click_to_button_user() throws InterruptedException {
        user = new UserPage(driver);
        user.clicktoSettings();
        user.clicktobuttonUser();
        Thread.sleep(2000);


    }


    @When("i choose user and edit (.*) and (.*)$")
    public void i_choose_user_and_edit_first_name_and_last_name(String FirstName, String LastName) throws InterruptedException {
        user = new UserPage(driver);
        user.seEedituser(FirstName, LastName);
        Thread.sleep(6000);
        user.SaveUser();
        Thread.sleep(6000);
    }

    @Then("verfiy if user is edited")
    public void verfiy_if_user_is_edited() throws InterruptedException {
        user = new UserPage(driver);
        user.getRowsNbr();
        Thread.sleep(4000);

    }

}
