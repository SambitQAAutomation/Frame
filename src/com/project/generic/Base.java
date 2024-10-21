package com.project.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver driver;
	
@BeforeClass
public void OpenBrowsder() {
	driver = new ChromeDriver();
}
@BeforeMethod
public void Login() {
	
}
@AfterMethod
public void Logout() {
	
}
@AfterClass
public void CloseBrowser(){
	driver.quit();
}
}
