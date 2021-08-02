package StepsDefinitions;
import com.Pages.VehiclesPage;
import com.redsea.base.Base;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehiclesStepsPage extends Base {

	VehiclesPage vehicle;

	@When("go to workforcepage and click to button settnigs")
	public void go_to_workforcepage_and_click_to_button_settnigs() throws InterruptedException {
		Thread.sleep(2000);

		vehicle = new VehiclesPage(driver);
		vehicle.clicktoSetting();

	}

	@When("click to vehicules button")
	public void click_to_vehicules_button() throws InterruptedException {

		vehicle.clicktoVehicles();
		Thread.sleep(5000);
	}
	

	@Then("verify file is add or not")
	public void verify_file_is_add_or_not() {

	}

}
