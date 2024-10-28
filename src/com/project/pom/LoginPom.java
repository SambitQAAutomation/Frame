package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.generic.FileLib;

public class LoginPom{
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement untbx;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pwtbx;
	@FindBy(xpath="//button[@class='visibility-icon']")
	public WebElement eye;
	@FindBy(xpath = "//button[text()='Sign In']")
	public WebElement Signbutton;
	
	public LoginPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) throws InterruptedException {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	Thread.sleep(50000);
	Signbutton.click();		
	}	
}
