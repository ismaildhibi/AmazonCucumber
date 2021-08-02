package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RolesPage {

	WebDriver driver;
	WebElement item;
	List<WebElement> litscol;
	List<WebElement> row;

	@FindBy(id = "menu-link-Settings")
	WebElement btnsttings;
	@FindBy(id = "page-link-Roles")
	WebElement btnRoles;
	@FindBy(id = "add-icon-button")
	WebElement IconAddRoles;
	@FindBy(id = "roleName")
	WebElement Rolename;
	@FindBy(id = "roleDescription")
	WebElement RoleDescription;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-role-dialog/form/div[2]/tb-role/div/form/fieldset/mat-accordion/mat-expansion-panel[1]/mat-expansion-panel-header/span[2]")
	WebElement btnASSET;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-role-dialog/form/div[2]/tb-role/div/form/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div[1]/mat-slide-toggle/label/div")
	WebElement allasset;
	@FindBy(id = "save")
	WebElement Btnsave;
	@FindBy(id = "search-text-input")
	WebElement InputSearch ;

	public RolesPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 120);
		PageFactory.initElements(factory, this);
	}

	public RolesPage clicktoSettings() {
		btnsttings.click();
		return new RolesPage(driver);

	}

	public void clicktobuttonRole() {
		btnRoles.click();

	}
	public void clicktoaddRole() {
		IconAddRoles.click();
		
	}

	public void Setrolename(String name) {
		Rolename.click();
		Rolename.sendKeys(name);

	}
	public void Setdiscription(String description) {
		RoleDescription.sendKeys(description);
		
	}
	public void clicktoAssert() {
		btnASSET.click();
	}
	public void clickbtnAll() {
		allasset.click();
	}
	public void clicktoSaveRole() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Btnsave);
		actions.click().build().perform();
		
	}
	public void  SearchRole(String name) {
		InputSearch.click();
		InputSearch.sendKeys(name,Keys.ENTER);
		
		
	}
	public int getRowsNbrRole(String name) {
		WebElement rows = driver.findElement(By.xpath(
				"/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]"));
		row = rows.findElements(By.tagName("div"));
		int siz = row.size();

		WebElement cl = driver.findElement(By.xpath(
				"/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[1]"));
		// List<WebElement> c= cl.
		if (cl.getText().equals(name)) {
			//System.out.println(cl.getText().equals(cl));
			System.out.println("*************** Role is add ********************** ");
		} else {
			System.out.println("************** error  Role  not exist in this list ************* ");
		}
		return siz;

	}

}
