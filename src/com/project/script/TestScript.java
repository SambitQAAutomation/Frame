package com.project.script;


import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.generic.Base;
import com.project.generic.FileLib;
import com.project.pom.DevicesPom;
@Listeners(com.project.generic.ListnerImplementation.class)
public class TestScript extends Base {
	
@Test(priority = 0)
public void ClickDevices() {
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
DevicesPom d=new DevicesPom(driver);
///wait.until(ExpectedConditions.visibilityOf(d.Ringer()));
wait.until(ExpectedConditions.visibilityOf(d.Devices()));
//wait.until(ExpectedConditions.visibilityOf(d.Player()));
d.Devices().click();
boolean Ringer = d.Ringer().isDisplayed();
boolean	Player = d.Player().isDisplayed();
Assert.assertTrue(Player);
Assert.assertTrue(Ringer);
}
@Test(priority = 1)
public void CreateRinger() throws IOException {
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
   DevicesPom d=new DevicesPom(driver);
  // wait.until(ExpectedConditions.visibilityOf(d.Ringer()));
   d.Ringer().click();
   WebElement RingerisDisplay = driver.findElement(By.xpath("//div[text()='Ringer']"));
   Assert.assertTrue(RingerisDisplay.isDisplayed(),"Button is clicked ");
   d.addDevice().click();
   Assert.assertTrue(d.CancelButton().isDisplayed(),"Successfully Clicked on AddDevice");
   
   FileLib f=new FileLib();
  String Dn = f.getPropertyData("Dn");
   d.DeviceName().sendKeys(Dn);
   String DevicenameValue = d.DeviceName().getAttribute("value");
   Assert.assertEquals(DevicenameValue, Dn,"Successfulle Sended Value");
   
   String Sl = f.getPropertyData("Sl");
   d.SerialNumber().sendKeys(Sl);
   String SerialNumberValue = d.SerialNumber().getAttribute("value");
   Assert.assertEquals(SerialNumberValue, Sl);
   d.SubmitButton().click();
   
}
}
