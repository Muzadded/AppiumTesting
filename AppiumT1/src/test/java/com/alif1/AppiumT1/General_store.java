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
	
	@Test (enabled = false)
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
	@Test (enabled = false)
	public void selectmultiitemTest() throws InterruptedException {
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
		
		//scroll for Converse All Star
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"));"));
		//Select Converse All Star
		int count1=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i = 0; i<count1; i++) {
			String item_name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(item_name.equalsIgnoreCase("Converse All Star")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			}
		}
		
		//scroll for Jordan Lift Off
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"));"));
		//Select Converse All Star
		int count2=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i = 0; i<count2; i++) {
			String item_name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(item_name.equalsIgnoreCase("Jordan Lift Off")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			}
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000l);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(6000l);
	}
	
	@Test (enabled = false)
	public void addcartToastmsgTest() {
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
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		String toastMsg=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMsg, "Please add some product at first");
		
	}
	
	@Test
	public void GetBackAddMoreTest() throws InterruptedException {
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
		
		//scroll for Air Jordan 9 Retro
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));"));
		//Select Air Jordan 9 Retro
		int count1=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
			
		for(int i = 0; i<count1; i++) {
			String item_name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();			
			if(item_name.equalsIgnoreCase("Air Jordan 9 Retro")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
					
			}
		}
		//
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(1000l);
		driver.navigate().back();
		
		
		//scroll for PG 3
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));"));
		//Select PG 3
		int count2=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
					
		for(int i = 0; i<count2; i++) {
			String item_name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();			
			if(item_name.equalsIgnoreCase("PG 3")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
							
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000l);
	}
}
