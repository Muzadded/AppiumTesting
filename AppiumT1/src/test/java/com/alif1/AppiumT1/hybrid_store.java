package com.alif1.AppiumT1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class hybrid_store extends setup{

	@Test
	public void TestHybrid() throws InterruptedException{
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
			///scroll to the item
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"));"));
			//Select Converse All Star
			int count=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
			for(int i = 0; i<count; i++) {
				String item_name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
				
				if(item_name.equalsIgnoreCase("Converse All Star")) {
					driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
					
				}
			}
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(2000l);
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
			Thread.sleep(6000l);
			
			//Type Appium in google
			
			Set<String> contextNames = driver.getContextHandles();
			
			for (String contextName : contextNames) {
			    System.out.println(contextName); 
			}
		
			driver.context("WEBVIEW_com.androidsample.generalstore");
			Thread.sleep(3000l);
			driver.findElement(By.name("q")).sendKeys("Appium");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000l);
			//Press BAck Button
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(5000l);
			driver.context("NATIVE_APP"); 
			
			 
	}
}
