package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Select_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);
		
		
		WebElement r=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));//select er path		
		Select select=new Select(r);		
		//select.selectByVisibleText("Option1");
		select.selectByIndex(0);
		//select.selectByValue("option1");
		driver.quit();
	}

}
