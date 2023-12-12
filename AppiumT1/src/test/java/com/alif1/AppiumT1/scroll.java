package com.alif1.AppiumT1;


import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class scroll extends setup {
	
	@Test
	public void scrollTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(2000);
		
		//scrollToElement("WebView");
		//scrollToEnd();
	}
}
