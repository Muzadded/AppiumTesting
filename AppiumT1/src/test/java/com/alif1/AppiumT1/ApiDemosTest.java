package com.alif1.AppiumT1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApiDemosTest extends setup_demos {

	@Test (enabled = false)
	public void GalleryTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		driver.findElement(AppiumBy.accessibilityId("false")).click();
		driver.findElement(AppiumBy.accessibilityId("false")).sendKeys("True");
		driver.hideKeyboard();	
	}
	@Test (enabled = false)
	public void animationTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
		
		for(int i = 1; i<=3; i++) {
			driver.findElement(By.xpath("//android.view.View")).click();
			Thread.sleep(1000l);
		}
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Reversing")).click();
		driver.findElement(AppiumBy.accessibilityId("Play")).click();
		Thread.sleep(2000l);
		driver.findElement(AppiumBy.accessibilityId("Reverse")).click();
		Thread.sleep(2000l);
		driver.findElement(AppiumBy.accessibilityId("Reverse")).click();
		Thread.sleep(2000l);
	}
	
	@Test (enabled = false)
	public void SmsSentTesting() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("OS")).click();
		driver.findElement(AppiumBy.accessibilityId("SMS Messaging")).click();
		driver.findElement(AppiumBy.accessibilityId("Enable SMS broadcast receiver")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/sms_recipient\"]")).sendKeys("Alif");
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/sms_content\"]")).sendKeys("Call Me Soon. Bye");
		Thread.sleep(1000l);
		driver.findElement(AppiumBy.accessibilityId("Send")).click();
		Thread.sleep(2000l);
	}
	
	
	
}
