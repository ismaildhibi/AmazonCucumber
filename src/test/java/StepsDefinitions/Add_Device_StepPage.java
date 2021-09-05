package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Device_StepPage extends Base {

	DevicePage device;

	@When("Click to  Devices menu and click to add new device")
	public void click_to_devices_menu_and_click_to_add_new_device() {
		device = new DevicePage(driver);
	//	device.clicktoSttings();
		device.clicktoDevices();

	}

	@When("I should redirect to device page")
	public void i_should_redirect_to_device_page() throws InterruptedException {
		device = new DevicePage(driver);
		device.URLdevice();
		Thread.sleep(1000);

	}

	@When("enter the name {string} and type {string} of device")
	public void enter_the_name_and_type_of_device(String name, String type) throws InterruptedException {
		device = new DevicePage(driver);
		device.clicktoadddevice();
		Thread.sleep(3000);
		device.setnamedevice(name);
		device.cleardefaultdevice();
		//device.settypedevice();
		device.settypedevice2();
		Thread.sleep(3000);// the xpath of device is change
		//device.settypedevice2(); // the xpath of device is change
	}

	@When("the user save device and verify {string} to contractor")
	public void the_user_assign_the_new_deice_to_contractor(String name) throws InterruptedException {
		device = new DevicePage(driver);
		device.savedevice();
		Thread.sleep(2000);
	}

	@Then("The device is added successfully")
	public void the_device_is_added_successfully() {
		System.out.println("user is added");
	}

}
