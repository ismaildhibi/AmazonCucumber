package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;

import io.cucumber.java.en.When;

public class Delete_Multiple_Devices extends  Base {
	
	  DevicePage device;
	
	@When("Click to  Devices menu and chose device UID")
	public void click_to_devices_menu_and_chose_device_uid() throws Throwable {
		 device = new DevicePage(driver);
	        device.selectsearch();
	        Thread.sleep(2000);
	}

	@When("search the device {string} will be delete")
	public void search_the_device_will_be_delete(String name) throws Throwable {
		 
	        device.selectdevicename();
	        Thread.sleep(2000);
	        device.setsearchbar(name);
	        Thread.sleep(2000);
	}

	@When("Select devices  and click to delete")
	public void select_devices_and_click_to_delete() throws Throwable {
		device = new DevicePage(driver);   
        device.SelectselectAlldevice();
        Thread.sleep(4000);
        device.ClickToDeleteAll();
	}

	@When("Delete pop up is displayed showing the message delete multiple device")
	public void delete_pop_up_is_displayed_showing_the_message_delete_multiple_device() throws InterruptedException {
		 String messsagedelete = device.getTextDeleteAllDevice();
	        String resultatemessage = "Are you sure you want to delete 3 devices?";
	        if (messsagedelete.equals(resultatemessage)) {
	            System.out.println("*******message delete is displayed*******");
	        } else {
	            System.out.println("*******message not displayed*******");
	        }
	        Thread.sleep(1500);
	}



}
