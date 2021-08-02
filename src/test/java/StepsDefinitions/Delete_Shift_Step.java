package StepsDefinitions;

import com.Pages.ShiftPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_Shift_Step extends Base {
	
	ShiftPage shift;   
	
@When("click to Shift button shift and srarch {string} the shift will be delete it")
public void click_to_shift_button_shift_and_srarch_the_shift_will_be_delete_it(String name) throws InterruptedException {
	
	shift = new ShiftPage(driver);
	shift.clicktobuttonShift();
	shift.SearchShift(name);
	Thread.sleep(2000);
}

@Then("the user delete shift")
public void the_user_delete_shift() throws InterruptedException {
	shift = new ShiftPage(driver);
	shift.deleteShift();
	 Thread.sleep(2000);
	
	
 
}


}
