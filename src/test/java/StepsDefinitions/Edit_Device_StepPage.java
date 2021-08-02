package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_Device_StepPage extends Base {
	
	DevicePage device ;
	
	@When("the user search the device {string} and click to double click to edit")
	public void the_user_search_the_device_and_click_to_double_click_to_edit(String name) throws InterruptedException {
		device = new DevicePage(driver) ;
		device.selectsearch();
		Thread.sleep(2000);
		device.selectdevicename();
		Thread.sleep(2000);
		device.setsearchbar(name);
		Thread.sleep(2000);
		device.clicktoeditdevice();
		Thread.sleep(3000);
		
	}

	@Then("the user edit divice : type , label , description and click to save")
	public void the_user_edit_divice_type_label_description_and_click_to_save() {
	}


}
