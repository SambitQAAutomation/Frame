package com.project.script;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.generic.Base;
@Listeners(com.project.generic.ListnerImplementation.class)
public class TestScript extends Base {
	
@Test(invocationCount = 1)
public void Test() {
	
}
}
