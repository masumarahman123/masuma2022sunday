package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6l,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6l,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
