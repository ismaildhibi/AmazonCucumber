package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VehiclesPage {

    WebDriver driver;

    @FindBy(xpath = "//body/tb-root[1]/tb-home[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-toolbar[1]/tb-side-menu[1]/ul[1]/li[3]/tb-menu-toggle[1]/a[1]/span[1]/span[1]/div[1]")
    WebElement btnsttings;
    @FindBy(xpath = "//body/tb-root[1]/tb-home[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-toolbar[1]/tb-side-menu[1]/ul[1]/li[3]/tb-menu-toggle[1]/ul[1]/li[8]/tb-menu-link[1]/a[1]/span[1]/span[1]/span[1]")
    WebElement btnvehicule;


    public VehiclesPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    public void clicktoSetting() {

        btnsttings.click();
    }

    public void clicktoVehicles() {
        btnvehicule.click();


    }

}
