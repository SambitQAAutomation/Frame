package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.generic.FileLib;

public class LoginPom{
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgBtn.click();		
	}	
}
