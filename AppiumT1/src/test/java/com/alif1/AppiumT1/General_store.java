package com.alif1.AppiumT1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class General_store extends setup{
	
	@Test (enabled = false)
	public void dropDownTest() {
		
		//Scroll Select Argentina
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
		//Type NAme
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shakira");
		driver.hideKeyboard();
		//Select female
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		//Lets Shop button
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}
	
	@Test
	public void toastmsgTest(){
		
		//Scroll Select Argentina
			driver.findElement(By.id("android:id/text1")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
			//Select female
			driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
			//Lets Shop button
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			//Toast Message
			String toastMsg=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			Assert.assertEquals(toastMsg, "Please enter your name");		
	}
}
