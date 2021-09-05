package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

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
    @FindBy(id = "clear")
    WebElement clearinputdevice;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/mat-option[10]")
    WebElement inputdeviceprofile;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-device-wizard/div/div[2]/mat-horizontal-stepper/div[2]/div[3]/form/tb-entity-autocomplete/mat-form-field/div/div[1]/div/input")
    WebElement clicktoinputcustmer;
    @FindBy(id = "delete-button")
    WebElement btnDeletdevice;
    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/tb-confirm-dialog/div[2]/button[2]")
    WebElement alerConfirmdeletuser;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement Confirmdeletuser;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]")
    WebElement clicktoeditdevice;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer/div/tb-entity-details-panel/tb-details-panel/header/mat-toolbar/section/button[2]")
    WebElement EditeDevice;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer/div/tb-entity-details-panel/tb-details-panel/div/mat-tab-group/div/mat-tab-body[1]/div/tb-device/div[2]/form/fieldset/tb-device-profile-autocomplete/mat-form-field/div/div[1]/div[1]/div/button[2]")
    WebElement Editebutton2Device;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer/div/tb-entity-details-panel/tb-details-panel/header/mat-toolbar/div/button")
    WebElement CloseEdit;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/h2")
    WebElement messagedeletedevice;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/h2")
    WebElement messagedeleteAlldevice;
    
    
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/tb-ag-grid-header-select/mat-checkbox/label/div")
    WebElement chekboxselectall;
    @FindBy(xpath = "  /html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/button")
    WebElement clicktodeletebutton;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/mat-toolbar/tb-breadcrumb")
    WebElement clicktodisplaybuttondeletaAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/form/div/mat-form-field/div/div[1]/div[4]/button/span[1]/mat-icon")
    WebElement clickToClearsearch;
    
    

    public DevicePage(WebDriver driver) {

        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 500);
        PageFactory.initElements(factory, this);
    }

    public void URLdevice() {
        String URL = driver.getCurrentUrl();
        if (URL.contains("http://tt-qa.dev-machinestalk.com/devices")) {
            System.out.println("Landed in correct URL" + "" + URL);

        } else {
            System.out.println("Landed in wrong URL");

        }

    }

    public void clicktoSttings() {
        btnsttings.click();
      

    }
    public void clicktoDevices() {
    
    	btnDevices.click();
    	
    }

    public void clicktoadddevice() {
        iconaddDevice.click();
        addNewDevice.click();
    }

    public void setnamedevice(String name  ) {
    	namedevice.click();
        namedevice.sendKeys(name );

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
        searchbar.clear();
        searchbar.sendKeys(name, Keys.ENTER);
        
    }

    public void cleardefaultdevice() {
        clearinputdevice.click();
       


    }
    public void ClickToEditDevice() {
    	EditeDevice.click();
  	
    }
    public void ClickToSecondEditDevice() {
    	Editebutton2Device.click();
    	
    }
    public void Closepoopup() {
    	CloseEdit.click();
    	
    }


    public void settypedevice() {
   // inputdeviceprofile.click();
   // btndeviceProfile.clear();
  
    
    }
    public void settypedevice2() {
    	btndeviceProfile.clear();
    	  btndeviceProfile.sendKeys("w");
    	
    	
    }


    public void selecttypedevice() throws InterruptedException {
        List<WebElement> lists = driver.findElements(By.id("mat-autocomplete-2"));

        System.out.println("number of customer are: " + lists.size());
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getText());
// checking that text by for loop and pick 
            if (lists.get(i).getText().contains("wearableTag")) {
                lists.get(i).click();
            }
            break;
        }

    }

    public void clickDeletdevice() {
        btnDeletdevice.click();

    }
    public void clickToclearSearch() {
    	clickToClearsearch.click();
    	
    }

    public void clickTpConfirmDeletdevice() {
        Confirmdeletuser.click();

    }
    public void  SelectselectAlldevice() {
    	chekboxselectall.click();
    	clicktodisplaybuttondeletaAll.click();
    	
    }
    public void  ClickToDeleteAll() {
    	clicktodeletebutton.click();	
    }

    public void clicktoeditdevice() {

        Actions actions = new Actions(driver);
        actions.moveToElement(clicktoeditdevice);
        actions.click().build().perform();

    }

    public String getTextDeleteDevice() {
        String message = (messagedeletedevice).getText();
        System.out.println(message);
        return message;
    }
    public String getTextDeleteAllDevice() {
        String message = (messagedeleteAlldevice).getText();
        System.out.println(message);
        return message;
    }

}
