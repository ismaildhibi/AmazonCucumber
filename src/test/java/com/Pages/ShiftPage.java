package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ShiftPage {

    WebDriver driver;
    WebElement item;

    @FindBy(id = "menu-link-Settings")
    WebElement btnsttings;
    @FindBy(id = "page-link-Shifts")
    WebElement btnShift;
    @FindBy(id = "add-icon-button")
    WebElement IconAddShift;
    @FindBy(id = "name")
    WebElement shiftname;
    @FindBy(id = "description")
    WebElement descriptioninput;

    @FindBy(id = "saturday-input")
    WebElement chekboxsaturday;
    @FindBy(id = "saturday-from")
    WebElement timesaturdayfrom;
    @FindBy(id = "saturday-to")
    WebElement timesaturdayto;

    @FindBy(id = "sunday-input")
    WebElement chekboxsunday;
    @FindBy(id = "sunday-from")
    WebElement timesundayfrom;
    @FindBy(id = "sunday-to")
    WebElement timesundayto;

    @FindBy(id = "monday-input")
    WebElement chekboxmonday;
    @FindBy(id = "monday-from")
    WebElement timemondayfrom;
    @FindBy(id = "monday-to")
    WebElement timemondayto;

    @FindBy(id = "tuesday-input")
    WebElement chekbotuesday;
    @FindBy(id = "tuesday-from")
    WebElement timetuesdayfrom;
    @FindBy(id = "tuesday-to")
    WebElement timetuesdayto;

    @FindBy(id = "wednesday-input")
    WebElement chekboxwednesday;
    @FindBy(id = "wednesday-from")
    WebElement timewednesdayfrom;
    @FindBy(id = "wednesday-to")
    WebElement timewednesdayto;
    @FindBy(id = "save")
    WebElement saveshift;

    @FindBy(id = "search-text-input")
    WebElement searchbar;
    @FindBy(id = "edit-shift")
    WebElement clicktoeditshift;
    @FindBy(xpath = "//div[@role=\"tab\"]/div[text()=\"HOLIDAYS\"]")
    WebElement clicktoADDHOLIDAY;
    @FindBy(id = "holiday-date")
    WebElement dateholiday;

    @FindBy(id = "holiday-name")
    WebElement holidayname;
    @FindBy(id = "add-icon")
    WebElement adddate;
    @FindBy(id = "delete-button")
    WebElement deleteShift;
    @FindBy(xpath = "//span[normalize-space()='Yes, delete']")
    WebElement alerConfirmdeletuser;

//	/div/snack-bar-container/tb-snack-bar-component/div/div

    public ShiftPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 120);
        PageFactory.initElements(factory, this);
    }

    public void clicktoSettings() {
        btnsttings.click();

    }

    public void clicktobuttonShift() {
        btnShift.click();

    }

    public void clicktoaddShift() {
        IconAddShift.click();

    }

    public void setnnameShift(String name) {
        shiftname.sendKeys(name);

    }

    public void setnnamedescription(String description) {
        descriptioninput.sendKeys(description);

    }

    public void clicktosaturday() {

        Actions actions = new Actions(driver);
        actions.moveToElement(chekboxsaturday);
        actions.click().build().perform();
        timesaturdayfrom.sendKeys("0800A");
        timesaturdayto.sendKeys("0400P");

    }

    public void clicktosunday() {
        Actions actions = new Actions(driver);
        actions.moveToElement(chekboxsunday);
        actions.click().build().perform();
        timesundayfrom.sendKeys("0800A");
        timesundayto.sendKeys("0400P");

    }

    public void clicktomonday() {

        Actions actions = new Actions(driver);
        actions.moveToElement(chekboxmonday);
        actions.click().build().perform();
        timemondayfrom.sendKeys("0800A");
        timemondayto.sendKeys("0400P");

    }

    public void clicktotuesday() {

        Actions actions = new Actions(driver);
        actions.moveToElement(chekbotuesday);
        actions.click().build().perform();
        timetuesdayfrom.sendKeys("0800A");
        timetuesdayto.sendKeys("0400P");

    }

    public void clicktowednesday() {

        Actions actions = new Actions(driver);
        actions.moveToElement(chekboxwednesday);
        actions.click().build().perform();
        timewednesdayfrom.sendKeys("0800A");
        timewednesdayto.sendKeys("0400P");

    }

    public void saveshift() {
        saveshift.click();
    }

    public void SearchShift(String name) {
        searchbar.click();
        searchbar.sendKeys(name, Keys.ENTER);
    }

    public void clicktoEditShift() {
        clicktoeditshift.click();
    }

    public void clicktoAddholiday() {
        clicktoADDHOLIDAY.click();
    }

    public void clicktoAddholiday(String date) {
        dateholiday.sendKeys(date);
    }

    public void setholidayname(String name) {
        holidayname.sendKeys(name);
    }

    public void clicktoadddate() {
        adddate.click();
    }

    public void deleteShift() {
        deleteShift.click();
        alerConfirmdeletuser.click();

        System.out.println("user is deleted");
    }

}
