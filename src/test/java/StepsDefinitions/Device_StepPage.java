package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Device_StepPage extends Base {
	
	DevicePage device ;
	@When("click to Shift button and click to add new device")
	public void click_to_shift_button_and_click_to_add_new_device() {
		device = new DevicePage(driver) ;
		device.clicktoDevices();
	   
	}

	@When("I should redirect to device page")
	public void i_should_redirect_to_device_page() throws InterruptedException {
	device = new DevicePage(driver) ;
	device.URLdevice() ;

		Thread.sleep(1000);
	  
	}
	@When("enter the name {string} and label {string} of device and select deviceprofile")
	public void enter_the_name_and_label_of_device_and_select_deviceprofile(String name, String label) throws InterruptedException {
		
		device = new DevicePage(driver) ;
		device.clicktoadddevice();
		Thread.sleep(3000);
		device.setnamedevice(name); 
		device.setlabeldevice(label);
		device.clicknextstep();
		device.clicknextstep();
		device.openlistofcustmer();
		device.selectcustomer();
		Thread.sleep(5000);
	}

	@Then("the user save device and verify {string} to contractor")
	public void the_user_assign_the_new_deice_to_contractor(String name) throws InterruptedException {
		device = new DevicePage(driver) ;
	;
		device.savedevice();
//		Thread.sleep(5000);
//		device.selectsearch();
//		Thread.sleep(2000);
//		device.selectdevicename();
//		Thread.sleep(2000);
//		device.setsearchbar(name);
//		device.clickassigntocustomer();
//		device.openlistofcustmer();
//		device.selectcustomer();
//		
		
		Thread.sleep(20000);
	}

}
