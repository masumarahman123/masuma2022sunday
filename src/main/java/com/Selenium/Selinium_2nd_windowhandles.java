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

public class Selinium_2nd_windowhandles {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);
	
		//window handles
		driver.findElement(By.xpath("//*[text()='Open Window']")).click();
		Set <String>window=driver.getWindowHandles(); //collection
		Iterator <String>it=window.iterator();
	 
	/**	while(it.hasNext()) {
			it.next();
		}
	 System.out.println(it);//..session ID of browser java.util.LinkedHashMap$LinkedKeyIterator@61078690
	 */
	 
	 String parent=it.next();
	 String child=it.next();
	 //String child2nd=it.next();
	// String child3nd=it.next();
	 
	 driver.switchTo().window(child);
	 String childTillle=driver.getTitle();// String actual
	 System.out.println("child tittle..."+childTillle);	 
	 String expectedChild="QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
	 Assert.assertEquals(childTillle, expectedChild);	 
	 Thread.sleep(5000);
	 driver.close();//current child window close//instance thakbea//cookies set thakbea
	 
	 driver.switchTo().window(parent);
	 String parentTittle= driver.getTitle();//parent window tittle nebea
	 System.out.println(parentTittle);
	 String expectedParent="Practice Page";
	 Assert.assertEquals(parentTittle, "Practice Page");
	 System.out.println("child tittle..."+childTillle);	;
	 
	 Thread.sleep(5000);
	 driver.quit();//everything close all window open buy the seleniuum
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
	
	
	

}
