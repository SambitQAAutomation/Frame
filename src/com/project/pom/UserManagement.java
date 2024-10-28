package com.project.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement {

	@FindBy(xpath = "//span[text()='User Management']")
	public WebElement UserManagement;
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement Admin;
	@FindBy(xpath = "//span[text()='User']")
	public WebElement User;
}
