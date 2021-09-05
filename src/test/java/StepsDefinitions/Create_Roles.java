package StepsDefinitions;

import com.Pages.RolesPage;
import com.redsea.base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create_Roles extends Base {

    RolesPage role;

    @When("click to Role button")
    public void click_to_role_button() throws InterruptedException {
        role = new RolesPage(driver);
        role.clicktobuttonRole();
        Thread.sleep(2000);

        role.clicktoaddRole();
        Thread.sleep(2000);

    }

    @When("click to add new role then set (.*) and (.*)$")
    public void click_to_add_new_role_then_set_automation_role_and_this_role_for_automation_and_select_operations(String name, String description) throws InterruptedException {

        role = new RolesPage(driver);
        role.Setrolename(name);
        role.Setdiscription(description);
        Thread.sleep(2000);


    }

    @When("selecct Operations and save")
    public void selecct_operations_and_save() throws InterruptedException {
        role = new RolesPage(driver);
        role.clicktoAssert();
        Thread.sleep(2000);
        role.clickbtnAll();
        Thread.sleep(6000);


    }

    @Then("verfifay the (.*)$")
    public Edit_Role verfifay_the_automation_role_of_role_is_add(String name) throws InterruptedException {
        role = new RolesPage(driver);
        role.clicktoSaveRole();
        Thread.sleep(4000);

        role.SearchRole(name);
        Thread.sleep(4000);

        role.getRowsNbrRole(name);
        return new Edit_Role ();

    }


}
