package StepsDefinitions;

import com.Pages.UserPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOut extends Base{
	
	 UserPage user;
	 
	 @When("the user click to button profil click to Logout")
	 public void the_user_click_to_button_profil_click_to_logout() throws Throwable {
		   user = new UserPage(driver);
		   Thread.sleep(2000);
		   user.clicktologouts();
	 }

	 @Then("the user logout")
	 public void the_user_logout() {
		   user = new UserPage(driver);
		   System.out.println("The user logout");

	 }



	

}
