package com.project.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DevicesPom {
	
@FindBy(xpath = "//span[text()='Devices']")
public WebElement Devices;
@FindBy(xpath = "//span[text()='Ringer']")
public WebElement Ringer;
@FindBy(xpath = "//span[text()='Player+']")
public WebElement Player;
@FindBy(xpath = "//a[text()=' ADD Device ']")
public WebElement addDevice;
@FindBy(xpath = "(//input[@placeholder='Device Name *'])")
public WebElement DeviceName;
@FindBy(xpath = "(//input[@placeholder='Serial Number *'])")
public WebElement SerialNumber;
@FindBy(xpath = "//button[text()='Cancel']")
public WebElement CancelButton;
@FindBy(xpath = "//button[text()='Submit']")
public WebElement SubmitButton;
@FindBy(xpath = "//span[text()='User']")
public WebElement User;
@FindBy(xpath = "//button[text()=' Add New ']")
public WebElement AddNewButton; 

public DevicesPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement Devices() {
	return Devices;
}
public WebElement Ringer() {
	return Ringer;
}
public WebElement Player() {
	return Player;
}
public WebElement addDevice() {
	return addDevice;
}
public WebElement DeviceName() {
	return DeviceName;
}
public WebElement SerialNumber() {
	return SerialNumber;		
}
public WebElement CancelButton() {
	return CancelButton;
}
public WebElement SubmitButton() {
	return SubmitButton;
}
public WebElement User() {
	return User;
}
public WebElement AddNewButton() {
	return AddNewButton;
}
}
