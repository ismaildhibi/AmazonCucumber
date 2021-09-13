package StepsDefinitions;

import com.Pages.RolesPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_Role extends Base{
	
	   RolesPage role;
	
	@When("click to button edit")
	public void click_to_button_edit() throws InterruptedException {
		role = new RolesPage(driver);
		role.ClickToEditRole();
		  Thread.sleep(1000);
	  
	}
	
	@When("set the new (.*) and (.*)$")
	public void set_the_new_automation_roleedit_and_this_role_for_automation_is_edit(String name, String description) throws InterruptedException {
		 role = new RolesPage(driver);
	        role.SetrditNewrolename(name);
	        Thread.sleep(1000);
	        role.SetNewdiscription(description);
	        role.clicktoSaveRole();
	        Thread.sleep(4000);

	   
	}
	@Then("verify the role is edit")
	public Delete_Role verify_the_role_is_edit() {
	   System.out.println("edit ");
	   return new Delete_Role();
	}




}
