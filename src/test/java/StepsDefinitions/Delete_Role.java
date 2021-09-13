package StepsDefinitions;

import com.Pages.RolesPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_Role  extends Base {

    RolesPage role;
	
	
    @When("click to delete button and confirm")
	public void click_to_delete_button_and_confirm() {
		  role = new RolesPage(driver);	
		  role.ClickToDeleteRole();
	   
	}
    @When("message delete is display")
    public void message_delete_is_display() throws InterruptedException {
		role = new RolesPage(driver);	
		 String messsagedelete = role.getTextDeletRole();
	        String resultatemessage = "Are you sure you want to delete the role 'AutomationRoleedit'?";
	        if (messsagedelete.equals(resultatemessage)) {
	            System.out.println("*******message delete is displayed*******");
	           
	        } else {
	            System.out.println("*******message not displayed*******");
	        }
	        Thread.sleep(1500);
	}


 

	@Then("Confirm delete then the role  successfully deleted")
	public void Confirm_delete_then_the_role_successfully_deleted() {
		role = new RolesPage(driver);	
		role.ClickToConfirmDeleteRole();
		System.out.println("The role is deleted ");
	   
	}



}
