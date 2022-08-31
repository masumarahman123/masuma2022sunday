package com.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWindowHandles {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6l,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6l,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String parentwindow=driver.getWindowHandle();
	
		
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		Set<String> childwindow=driver.getWindowHandles();//store all childwindow in the form of string with session id
	    Iterator<String>	it=childwindow.iterator();//all the childwindow will store object(it)  
	    
	    String parent=it.next();//already in parent window +got id 
	    String child_0ne=it.next();
	     //String child_two=it.next();
		
	     /**
	     while(it.hasNext()) {
	    	 it.next();
	    	driver.switchTo().window(child_0ne);
	     String childtittle=driver.getTitle(); 
	     }
	     */
	     driver.switchTo().window(child_0ne);//now selenium in all child window.prove it(assertion korte hobea)
	     String childtittle=driver.getTitle();
	     String expected="QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
	     Assert.assertEquals(childtittle, expected);
	     driver.close();
	     
	     driver.quit();
	}

}
