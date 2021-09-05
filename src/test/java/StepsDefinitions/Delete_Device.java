package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_Device extends Base {

    DevicePage device;

    @When("Click on Devices menu")
    public void click_on_devices_menu() {
        device = new DevicePage(driver);
        device.clicktoDevices();
    }

    @When("the user search the device {string} and click to button delete")
    public void the_user_search_the_device_and_click_to_button_delete(String name) throws InterruptedException {
        device = new DevicePage(driver);
        device.selectsearch();
        Thread.sleep(2000);
        device.selectdevicename();
        Thread.sleep(2000);
        device.setsearchbar(name);
        device.clickDeletdevice();

    }

    @When("Delete pop up is displayed showing the message")
    public void delete_pop_up_is_displayed_showing_the_message() throws InterruptedException {

        String messsagedelete = device.getTextDeleteDevice();
        String resultatemessage = "Are you sure you want to delete the device 'A0A10121'?";
        if (messsagedelete.equals(resultatemessage)) {
            System.out.println("*******message delete is displayed*******");
        } else {
            System.out.println("*******message not displayed*******");
        }
        Thread.sleep(1500);

    }

    @Then("The user confirm delete device and the device is deleted successfully")
    public void the_user_confirm_delete_device_and_the_device_is_deleted_successfully() throws InterruptedException {
        device = new DevicePage(driver);
        device.clickTpConfirmDeletdevice();// xpath changed
        Thread.sleep(3500);
        device.clickToclearSearch();
        Thread.sleep(200);

        System.out.println("device is deletet ");
  


    }

}
