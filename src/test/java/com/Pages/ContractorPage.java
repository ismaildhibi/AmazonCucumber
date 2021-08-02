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
import org.openqa.selenium.support.ui.Select;

public class ContractorPage {

	WebDriver driver;
	WebElement item;
	List<WebElement> litscol;
	List<WebElement> row;

	@FindBy(id = "menu-link-Settings")
	WebElement btnsttings;
	@FindBy(id = "page-link-Contractors")
	WebElement btnContractor;
	@FindBy(id = "add-icon-button")
	WebElement IconAddContractor;
	@FindBy(id = "title")
	WebElement InputNameContractor;
	@FindBy(id = "commercialRegistration")
	WebElement InputcommercialRegistration;
	@FindBy(id = "contractorType")
	WebElement InputcontractorType;
	@FindBy(xpath = "//*[@id=\"mainContractor\"]/span")
	WebElement selectFisrtone;
	@FindBy(id = "search-text-input")
	WebElement InputSearch;
	@FindBy(id = "mat-chip-list-input-0")
	WebElement Inputzone;
	@FindBy(id = "Azone")
	WebElement selectzone;
	@FindBy(id = "save-button")
	WebElement saveContractor;
	@FindBy(id = "delete-button")
	WebElement deletebutton;

	public ContractorPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 120);
		PageFactory.initElements(factory, this);
	}

	public void clicktoSettings() {
		btnsttings.click();

	}

	public void clicktoContractor() {
		btnContractor.click();

	}

	public void clicktoIconeAddContractor() {
		IconAddContractor.click();

	}

	public void SetFirstname(String firstname) {
		InputNameContractor.sendKeys(firstname);

	}

	public void SetCommercialRegistration(String CommercialRegistration) {
		InputcommercialRegistration.sendKeys(CommercialRegistration);

	}

	public void selectContractorType() {
		InputcontractorType.click();

	}

	public void selectFirstOne() {

		Actions actions = new Actions(driver);
		actions.moveToElement(selectFisrtone);
		actions.click().build().perform();

	}

	public void selectZone() {
		Inputzone.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(selectzone);
		actions.click().build().perform();

	}

	public void savecontractor() {
		saveContractor.click();
	}

	public void Searchcontractor(String name) {
		InputSearch.click();
		InputSearch.sendKeys(name, Keys.ENTER);

	}

	public void clicktodelete() {
		deletebutton.click();
	}

	public int getRowsNbrContractor(String name) {
		WebElement rows = driver.findElement(By.xpath(
				"/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]"));
		row = rows.findElements(By.tagName("div"));
		int siz = row.size();

		WebElement cl = driver.findElement(By.xpath(
				"/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]"));
		// List<WebElement> c= cl.
		if (cl.getText().equals(name)) {
			// System.out.println(cl.getText().equals(cl));
			System.out.println("*************** Contractor is add ********************** ");
		} else {
			System.out.println("************** error  Contractor  not exist in this list ************* ");
		}
		return siz;

	}

}
