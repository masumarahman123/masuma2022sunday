package com.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selinium_2nd_class {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);
		
	driver.findElement(By.xpath("//*[text()='Open Window']")).click();
	 Set <String>window=driver.getWindowHandles(); //collection
	 Iterator <String>it=window.iterator();
	 
		while(it.hasNext()) {
			it.next();
		}
	 System.out.println(it);//..java.util.LinkedHashMap$LinkedKeyIterator@61078690
	}

}
