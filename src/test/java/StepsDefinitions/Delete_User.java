package StepsDefinitions;

import com.Pages.UserPage;
import com.redsea.base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_User extends Base {

    UserPage user;

    @When("i filtre the user will be delete it")
    public void i_filtre_the_user_will_be_delete_it(DataTable whenData) throws InterruptedException {
        user = new UserPage(driver);
        user.clicktofiltre();
        user.setonfiltre(whenData.cell(0, 0));
        Thread.sleep(2000);

    }

    @Then("i choose user and delete it")
    public void i_choose_user_and_delete_it() throws InterruptedException {
        user.clickDeleteuser();
        Thread.sleep(2000);
        user.ConfirmclickDeleteuser();
        Thread.sleep(3500);
        System.out.println("user is deletet ");
    }

}
