package StepsDefinitions;

import com.Pages.DevicePage;
import com.redsea.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class Add_Multiple_Device extends Base {
    DevicePage device;
    
    @When("click to add new device")
    public void click_to_add_new_device() throws InterruptedException {
        device = new DevicePage(driver);
        device.clicktoDevices();  
        Thread.sleep(3000);
    }
   
    @Then("add multiple device name")
    public void add_multiple_device_name(DataTable credentials ) throws InterruptedException   {
    	
        device = new DevicePage(driver);
        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);       
        for (Map<String, String> form : data) {
        	device. clicktoadddevice();
        	Thread.sleep(2000);
        	String userName = form.get("Username");
        device.setnamedevice(userName);
        Thread.sleep(1500);
//        device.cleardefaultdevice();
//        Thread.sleep(1000);
//        device.settypedevice(); // the xpath of device is change
        device.savedevice();
        Thread.sleep(2000);
        }

    }

    @Then("the devices are added")
    public void the_devices_are_added() {
       System.out.println("the device is add");
    }


}
