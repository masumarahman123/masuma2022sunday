package com.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		String parentwindow=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//childwindow		
		Set<String>childwindow=driver.getWindowHandles();
		Iterator<String>it=childwindow.iterator();
		
		String parentwin=it.next();
	    String childwin=it.next(); 
	       
	     System.out.println(parentwin); //paste id
	     System.out.println(childwin);//paste id
	     
	     driver.switchTo().window(childwin);
	     System.out.println("childwindow..."+driver.getTitle());
	     
	     
	     
		
	}

}
