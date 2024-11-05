package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement {

	@FindBy(xpath = "//span[text()='User Management']")
	public WebElement UserManage;
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement Admin;
	@FindBy(xpath = "//span[text()='User']")
	public WebElement User;
	@FindBy(xpath = "//button[text()=' Add New ']")
	public WebElement AddNew;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName;
	@FindBy(xpath = "//div[@class='iti__selected-country-primary']")
	public WebElement CuntCode;
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement CuntCodeSearch;
	@FindBy(xpath = "//span[@class='iti__country-name']")
	public WebElement ClickInd;
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement Email;
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement Submit;
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement Cancel;
	
	public UserManagement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 	
	public WebElement UserManage() {
		return UserManage;
	}
	public WebElement Admin() {
		return Admin;
	}
}
