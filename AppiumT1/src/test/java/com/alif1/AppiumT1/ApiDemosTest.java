package com.alif1.AppiumT1;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApiDemosTest extends setup_demos {

	@Test
	public void GalleryTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		driver.findElement(AppiumBy.accessibilityId("false")).click();
		driver.findElement(AppiumBy.accessibilityId("false")).sendKeys("True");
		driver.hideKeyboard();	
	}
}
