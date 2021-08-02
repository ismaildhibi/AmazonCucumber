package StepsDefinitions;

import com.Pages.ShiftPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shift_Steppage extends Base {
	ShiftPage shift;

	@When("click to Shift button and click to add new shift")
	public void click_to_shift_button_and_click_to_add_new_shift() throws InterruptedException {
		shift = new ShiftPage(driver);
		Thread.sleep(2000);
		shift.clicktobuttonShift();
		Thread.sleep(2000);
		shift.clicktoaddShift();
		Thread.sleep(2000);
	}

	@When("the user enter shift (.*)  and (.*)$")
	public void the_user_enter_shift_automation_role_and_this_role_for_automation(String name, String description) {
		shift = new ShiftPage(driver);
		shift.setnnameShift(name);
		shift.setnnamedescription(description);
	}

	@When("the user will shoose the days of shift")
	public void the_user_will_shoose_the_days_of_shift() throws InterruptedException {
		shift = new ShiftPage(driver);
		shift.clicktosaturday();
		shift.clicktosunday();
		shift.clicktomonday();
		shift.clicktotuesday();
		shift.clicktowednesday();
		shift.saveshift();

		Thread.sleep(15000);
		
		
	}
	@Then("message should be display when the shift is add")
	public void message_should_be_display_when_the_shift_is_add() {
		
		
	}


}
