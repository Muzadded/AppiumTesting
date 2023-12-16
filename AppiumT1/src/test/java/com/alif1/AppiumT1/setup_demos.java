package com.alif1.AppiumT1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class setup_demos {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, InterruptedException {
		
		Map<String , String> env = new HashMap<String , String>(System.getenv());
		env.put("ANDROID_HOME", "C:\\Users\\Alif-PC\\AppData\\Local\\Android\\Sdk");
		env.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk-16.0.2");
		
		
		//Create capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("demo1");
		options.setPlatformName("Android");
		options.setCapability("platformVersion","11.0" );
		options.setApp("C:\\Users\\Alif-PC\\git\\repository\\AppiumT1\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setChromedriverExecutable("G:\\Versity\\FALL 2023\\SQA\\chromedriver.exe");
		
		//Create object for android Driver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
}
