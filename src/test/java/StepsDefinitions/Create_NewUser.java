package StepsDefinitions;

import com.Pages.LoginPage;
import com.Pages.UserPage;
import com.redsea.base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

public class Create_NewUser extends Base {

    LoginPage login;
    UserPage user;

    @When("go to workforcepage and verify if btn user is display")
    public void go_to_workforcepage_and_verify_if_btn_usur_is_display() {

        if (driver.findElement(By.xpath(
                "//body/tb-root[1]/tb-home[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-toolbar[1]/tb-side-menu[1]/ul[1]/li[3]/tb-menu-toggle[1]/a[1]/span[1]/span[1]/div[1]"))
                .isDisplayed()) {

            System.out.println("button of user is Visible");

        } else {

            System.out.println("button of user is InVisible");

        }

    }

    @When("click to user button and click  to icone add")
    public void click_to_user_button_and_click_to_icone_add() throws InterruptedException {
        user = new UserPage(driver);
        
    //   user.clicktoSettings();
        user.clicktobuttonUser();		
        Thread.sleep(3000);

    }

    @When("click to add user and send (.*) and (.*) and (.*) and (.*)$")
    public void click_to_add_user(String FirstName, String LastName, String Email, String Phone)
            throws InterruptedException {
        user = new UserPage(driver);
        user.clicktoaddUser();
        Thread.sleep(2000);
        user.clicktoaddUserindropdowen();
        Thread.sleep(2000);
        user.setNewUser(FirstName, LastName, Email, Phone);
        user.selectTypeContracteurUser();
        Thread.sleep(2000);
        user.ClicktoInputContractor();
        Thread.sleep(2000);
        user.ClicktoslectContractor();
        Thread.sleep(2000);
        
        user.selectRoles();
        user.SaveUser();
        Thread.sleep(12000);
        System.out.println("The user is added");

    }

//    @When("i filtre the user will be delete FirstName {string}")
//    public void i_filtre_the_user_will_be_delete(String firstname) throws InterruptedException {
//        user = new UserPage(driver);
//        Thread.sleep(6000);
//        user.clicktofiltre();
//        user.setonfiltre(firstname);
//        Thread.sleep(2000);
//        System.out.println("i filtre the user will be edit FirstName");
//
//
//    }


    @Then("verify if user is add")
    public void verify_if_user_is_add() throws InterruptedException {

    //    user.getRowsNbruser();
  

    }

}
