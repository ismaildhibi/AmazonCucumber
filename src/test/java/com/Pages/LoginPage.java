package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {


    WebDriver driver;

    @FindBy(id = "username")
    WebElement txt_username;
    @FindBy(id = "password")
    WebElement txt_passowrd;
    @FindBy(name = "login")
    WebElement btn_login;
    @FindBy(id = "resetPassword")
    WebElement resetPassword;
    @FindBy(xpath = "//span[contains(@class,'tb-entity-table-title ')]")
    WebElement textinadmin;
    @FindBy(xpath = "//span[@class='kc-feedback-text']")
    WebElement errormessage;
    @FindBy(id = "kc-page-title")
    WebElement pagerestpassword;
    @FindBy(xpath = "//input[@id='usernameEmail']")
    WebElement inputemailforgetpassword;
    @FindBy(id = "senderrorEmail")
    WebElement erroremail;
    @FindBy(id = "kc-form-buttons")
    WebElement btnsubmit;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 300);
        PageFactory.initElements(factory, this);
    }


    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_passowrd.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

    public void clickToResetPassword() {
        resetPassword.click();
    }

    public void setEmailinForgetpasswordpage(String email) {
        inputemailforgetpassword.sendKeys(email);
    }

    public void clicktosubmitemail() {
        btnsubmit.click();
    }


    public String getText() {
        String message = (textinadmin).getText();
        System.out.println(message);
        return message;
    }

    public String getTextErrorMessage() {
        String message = (errormessage).getText();
        System.out.println(message);
        return message;
    }

    public String getTextRestpassword() {
        String message = (pagerestpassword).getText();
        System.out.println(message);
        return message;
    }

    public String getTexterrorRestpassword() {
        String message = (erroremail).getText();
        System.out.println(message);
        return message;
    }

}
