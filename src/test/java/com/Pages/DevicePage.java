package com.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class DevicePage {
	
	WebDriver driver;
	
	@FindBy(id = "menu-link-Settings")
	WebElement btnsttings;
	@FindBy(id = "page-link-Devices")
	WebElement btnDevices;
	@FindBy(id = "add-icon-button")
	WebElement iconaddDevice;
	@FindBy(id = "Addnewdevice")
	WebElement addNewDevice;
	@FindBy(id = "name")
	WebElement namedevice;
	@FindBy(id = "label")
	WebElement labeldevice;
	@FindBy(id = "deviceProfile")
	WebElement btndeviceProfile;
	@FindBy(id = "TEST0605")
	WebElement TEST0605;
	@FindBy(id = "transportType")
	WebElement transportTypeDevice;
	@FindBy(id = "new-device-profile")
	WebElement btnNewdeviceprofile;
	@FindBy(id = "newDeviceProfileTitle")
	WebElement btnNewdeviceTitle;
	@FindBy(id = "ruleChainId")
	WebElement btnruleChainId;
	@FindBy(id = "LoraRuleChain")
	WebElement LoraRuleChain;
	@FindBy(id = "queue")
	WebElement btnqueue;
	@FindBy(id = "save")
	WebElement savedevice;
	@FindBy(id = "search-column-select")
	WebElement selectsearch;
	@FindBy(id = "search-column-option-name")
	WebElement deivecename;
	@FindBy(id = "search-text-input")
	WebElement searchbar;
	@FindBy(id = "next-step")
	WebElement btnNextstep;
	@FindBy(xpath = "//input[@formcontrolname=\"entity\"][1]")
	WebElement selectonecusmer;
	@FindBy(id= "assign-to-customer")
	WebElement assigntocustomer;
	@FindBy(xpath= "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-device-wizard/div/div[2]/mat-horizontal-stepper/div[2]/div[3]/form/tb-entity-autocomplete/mat-form-field/div/div[1]/div/input")
	WebElement clicktoinputcustmer;
	@FindBy(id = "delete-button")
	WebElement btnDeletdevice;
	@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/tb-confirm-dialog/div[2]/button[2]")
	WebElement alerConfirmdeletuser;
	@FindBy(xpath="/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]")
	WebElement clicktoeditdevice;

	public DevicePage(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}
	
	public void URLdevice() {
		String URL = driver.getCurrentUrl();
	    if(URL.contains("http://tt-qa.dev-machinestalk.com/devices"))
	    {
	        System.out.println("Landed in correct URL" +
	                "" + URL);

	    }else
	    {
	        System.out.println("Landed in wrong URL");

	    }
	
	}
	
	public void clicktoDevices() {
		btnsttings.click();
		btnDevices.click();
		
	}
	public void clicktoadddevice() {
		iconaddDevice.click();
		addNewDevice.click();	
	}	
	public void setnamedevice(String name) {
		namedevice.sendKeys(name);
	
	}
	public void setlabeldevice(String label) {
		labeldevice.sendKeys(label);	
	}
	public void selectdeviceProfile() {
		Actions actions = new Actions(driver);
		actions.moveToElement(btndeviceProfile);
		actions.click().build().perform();
	}
	public void savedevice() {
		savedevice.click();
	}
	public void selectsearch() {
		selectsearch.click();
	}
	public void selectdevicename() {
		deivecename.click();
	}
	public void setsearchbar(String name) {
		searchbar.click();
		searchbar.sendKeys(name,Keys.ENTER);;
	}	
	
	public void clicknextstep() {
		btnNextstep.click();
	}
	
	public void clickassigntocustomer() {
		assigntocustomer.click();
		
	}
	
	public void openlistofcustmer() {
		clicktoinputcustmer.click();
		
	}
	//div/div/mat-option

	public void selectcustomer() throws InterruptedException {
	    List <WebElement> lists = driver.findElements(By.xpath("//div/div/mat-option"));
       
	    System.out.println("number of customer are: "+lists.size());
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getText());
// checking that text by for loop and pick 
            if (lists.get(i).getText().contains("Aramco")) {
            	                lists.get(i).click();
            }
         break;
            }
       
		
	}
	public void clickDeletdevice() {
		btnDeletdevice.click();
		alerConfirmdeletuser.click();
	}
       
	public void clicktoeditdevice() {
		 
	  	Actions actions = new Actions(driver);
		actions.moveToElement(clicktoeditdevice);
		actions.click().build().perform();
		
	}
	
	
	

	}
