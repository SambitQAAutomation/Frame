package com.project.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.project.pom.LoginPom;



public class Base {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
@BeforeTest
public void OpenBrowsder() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
//@AfterTest
//public void closeBrowser() {
//Reporter.log("closeBrowser",true);	
////driver.quit();
//}

@BeforeMethod
public void Login() throws IOException, InterruptedException {
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	driver.get(url);
	String pw = f.getPropertyData("pw");
	String un = f.getPropertyData("un");
	LoginPom l=new LoginPom(driver);
	l.setLogin(un,pw);
}
//@AfterMethod
//public void logOut(){
////	driver.quit();
//}

}
