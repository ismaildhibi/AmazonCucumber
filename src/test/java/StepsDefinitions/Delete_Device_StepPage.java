package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;

public class Delete_Device_StepPage extends Base {
	
	DevicePage device ;
	
	@Then("the user search the device {string} and click to button delete")
	public void the_user_search_the_device_and_click_to_button_delete(String name) throws InterruptedException {
		device = new DevicePage(driver) ;
		device.selectsearch();
		Thread.sleep(2000);
		device.selectdevicename();
		Thread.sleep(2000);
		device.setsearchbar(name);
		device.clickDeletdevice();
		System.out.println("user is deletet ");
		 Thread.sleep(3500);
	}

}
