package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import net.bytebuddy.asm.Advice.Enter;

import java.util.List;

public class UserPage {

    WebDriver driver;
    WebElement item;
    List<WebElement> litscol;
    List<WebElement> r;
    @FindBy(id = "user-menu")
    WebElement uselogout;
    @FindBy(id = "logout")
    WebElement Buttonlogout;
    WebElement cl;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]")
    WebElement tableofusers;

    @FindBy(id = "menu-link-Settings")
    WebElement btnsttings;
    @FindBy(id = "page-link-Users")
    WebElement btnUser;
    @FindBy(id = "add-icon-button")
    WebElement iconAdd;
    @FindBy(id = "AddUser")
    WebElement Adduser;
    @FindBy(id = "firstName")
    WebElement InputFirstName;
    @FindBy(id = "lastName")
    WebElement InputLastName;
    @FindBy(id = "email")
    WebElement InputEmail;
    @FindBy(id = "phoneNumber")
    WebElement InputPhoneNumber;
    @FindBy(id = "searchText")
    WebElement GenirecRole;
    @FindBy(id = "delete-button")
    WebElement btnDeleteuser;
    @FindBy(xpath = "//button[contains(@class,'ok-btn mat-raised-button mat-button-base')]")
    WebElement Btnsave;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-user-dialog/form/div[2]/tb-users/div/form/div/fieldset[2]/div/mat-selection-list/mat-list-option/div")
    WebElement elments1;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-user-dialog/form/div[2]/tb-users/div/form/div/fieldset[1]/div[3]/mat-form-field/div/div[2]/div/mat-error")
    WebElement emailError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-user-dialog/form/div[2]/tb-users/div/form/div/fieldset[1]/div[4]/div[4]/mat-form-field/div/div[2]/div/mat-error")
    WebElement MobileError;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/tb-add-new-user-dialog/form/div[2]/tb-users/div/form/div/fieldset[2]/div/mat-error")
    WebElement RolesError;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div/div[5]/div[3]/span/span")
    WebElement filtreEmail;
    @FindBy(id = "search-text-input")
    WebElement filtresearch;

    @FindBy(xpath = "/html[1]/body[1]/tb-root[1]/tb-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/tb-ag-grid-entity[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/ag-grid-angular[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement Inputsearch;
    @FindBy(id = "edit-user")
    WebElement IconeEdituser;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/snack-bar-container/tb-snack-bar-component/div/div")
    WebElement alertmobile;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/snack-bar-container/tb-snack-bar-component/div/button/span[1]")
    WebElement closealerte;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/snack-bar-container/tb-snack-bar-component/div/div")
    WebElement aleremail;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement alerConfirmdeletuser;
    @FindBy(id = "ContractorUser")
    WebElement ContracteurUser;
    @FindBy(id = "customerId")
    WebElement InputContracteurUser;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/mat-option")
    WebElement slectContractor;


    public UserPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 120);
        PageFactory.initElements(factory, this);
    }

    public UserPage clicktoSettings() {
        btnsttings.click();
        return new UserPage(driver);

    }

    public void clicktobuttonUser() {
        btnUser.click();

    }

    public void clicktoaddUser() {

        iconAdd.click();

    }

    public void clicktoaddUserindropdowen() {

        Adduser.click();
    }

    public void setNewUser(String FirstName, String LastName, String Email, String Phone) {

        InputFirstName.sendKeys(FirstName);
        InputLastName.sendKeys(LastName);
        InputEmail.sendKeys(Email);
        InputPhoneNumber.sendKeys(Phone);

    }

    public void setEmailNewuser(String Email, String Phone) {
        InputEmail.click();
        InputEmail.sendKeys(Email);
        InputPhoneNumber.click();
        InputPhoneNumber.sendKeys(Phone);
    }

    public void setmobileNewuser(String Email, String Phone) {
        InputEmail.click();
        InputEmail.clear();
        InputEmail.sendKeys(Email);
        InputPhoneNumber.click();
        InputPhoneNumber.clear();
        InputPhoneNumber.sendKeys(Phone);
    }


    public void selectTypeContracteurUser() {
        ContracteurUser.click();

    }
    public void ClicktoInputContractor() throws InterruptedException {
    	InputContracteurUser.click();
    	Thread.sleep(1000);
    	InputContracteurUser.sendKeys("ismaildhibi");
    	
    }
    public void ClicktoslectContractor() {
    	
    	slectContractor.click();
    	
    }
    public void selectRoles() {
    	GenirecRole.sendKeys("For");
    	elments1.click();
    	
    }

    public void SaveUser() {
        Btnsave.click();

    }

    public void closealert() {
        closealerte.click();

    }

    public void clicktofiltre() {
    	 filtresearch.click();
    }

    public void setonfiltre(String FirstName) {

    	filtresearch.sendKeys(FirstName,Keys.ENTER);
    }

    public void clicktobuttonedit() {
        IconeEdituser.click();

    }

    public void seEedituser(String FirstName, String LastName) {
        InputFirstName.clear();
        InputFirstName.sendKeys(FirstName);
        InputLastName.clear();
        InputLastName.sendKeys(LastName);


    }

    public int getRowsNbr() {
        WebElement rows = driver.findElement(By.xpath(
                "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]"));
        r = rows.findElements(By.tagName("div"));
        int siz = r.size();

        WebElement cl = driver.findElement(By.xpath(
                "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[3]"));
        // List<WebElement> c= cl.
        if (cl.getText().equals("ismailEdit22")) {
            System.out.println(cl.getText().equals(cl));
            System.out.println("user is edited ");
        } else {
            System.out.println("error");
        }
        return siz;

    }

    public int getRowsNbruser() {
        WebElement rows = driver.findElement(By.xpath(
                "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]"));
        r = rows.findElements(By.tagName("div"));
        int siz = r.size();

        WebElement cl = driver.findElement(By.xpath(
                "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[5]"));
        // List<WebElement> c= cl.
        if (cl.getText().equals("ismaildhibi1@gmail.com")) {
            //System.out.println(cl.getText().equals(cl));
            System.out.println("user is add  ");
        } else {
            System.out.println("error");
        }
        return siz;

    }

    public int getCl() {
        // cl=driver.findElement(By.xpath("/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[5]"));
        int clnb = litscol.size();
        System.out.println("************************************cl= " + clnb);

        return clnb;
    }

    public void getEmail() {

        WebElement cl = driver.findElement(By.xpath(
                "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[5]"));
        // List<WebElement> c= cl.
        System.out.println("***************************************");
        System.out.println(cl.getText());
        System.out.println(cl);
        System.out.println("***************************************");

    }

    public void clickDeleteuser() {
        btnDeleteuser.click();
    }
    public void ConfirmclickDeleteuser() {
    	alerConfirmdeletuser.click();
    }
    
    public void clicktologouts() {
    	uselogout.click();
    	Buttonlogout.click();
    }

    public String getTexterroremail() {
        String message = (emailError).getText();
        System.out.println(message);
        return message;
    }

    public String getTexterrormobilephone() {
        String message = (MobileError).getText();
        System.out.println(message);
        return message;
    }

    public String getAlertEmail() {
        String message = (aleremail).getText();
        System.out.println(message);
        return message;
    }

    public String getAlertmobile() {
        String message = (alertmobile).getText();
        System.out.println(message);
        return message;
    }

}
