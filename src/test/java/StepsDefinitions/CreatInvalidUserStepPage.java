package StepsDefinitions;

import com.Pages.LoginPage;
import com.Pages.UserPage;
import com.redsea.base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatInvalidUserStepPage extends Base {

    LoginPage login;
    UserPage user;


    @When("click to add user then click to save")
    public void click_to_add_user_then_click_to_save() throws InterruptedException {
        user = new UserPage(driver);
        user.clicktoaddUser();
        Thread.sleep(2000);
        user.clicktoaddUserindropdowen();
        Thread.sleep(2000);
        user.SaveUser();

    }

    @Then("verify if error message is displayed.")
    public void verify_if_error_message_is_displayed() throws InterruptedException {
        user = new UserPage(driver);
        Thread.sleep(2000);
        String messsageemail = user.getTexterroremail();
        String resultatemail = "Email is required.";
        if (messsageemail.equals(resultatemail)) {
            System.out.println("*******message error email is displayed*******");
        } else {
            System.out.println("*******message not displayed*******");
        }

        String messsagemobile = user.getTexterrormobilephone();
        String resultatofmobile = "Mobile No is required.";
        if (messsagemobile.equals(resultatofmobile)) {
            System.out.println("*******message error mobile is displayed*******");
        } else {
            System.out.println("*******message not displayed*******");
        }


    }

    @When("verifiy  email is existe")
    public void verifiy_email_is_existe(DataTable whenData) throws InterruptedException {
        user = new UserPage(driver);
        user.setEmailNewuser(whenData.cell(0, 0), whenData.cell(0, 1));
        Thread.sleep(2000);
        user.selectRoles();
        user.SaveUser();
        String messsage = user.getAlertEmail();
        //	Assert.assertEquals((messsage), "Email user already exist");
        if (messsage.equals("Email user already exist")) {
            System.out.println("*******message existe email is displayed*******");
        } else {
            System.out.println("*******message not displayed*******");
        }
        user.closealert();
    }

    @Then("verify phone is existe")
    public void verify_phone_is_existe(DataTable whenData) throws InterruptedException {
        user.setmobileNewuser(whenData.cell(0, 0), whenData.cell(0, 1));
        Thread.sleep(2000);
        user.SaveUser();
        String messsage = user.getAlertmobile();
        //	Assert.assertEquals((messsage), "Email user already exist");
        if (messsage.equals("Phone user already exist")) {
            System.out.println("++++++++++message MOBILE  is displayed+++++++++");
        } else {
            System.out.println("----------message not displayed----------");
        }
        Thread.sleep(6000);
        user.closealert();
    }


}


 
