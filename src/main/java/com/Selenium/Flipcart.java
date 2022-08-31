package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6000l,TimeUnit.SECONDS);		
		//goto frame 1st
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_2QfC02']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");	
		
		//List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'lrtEPN _17d0yO')]"));	
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		for(int i=0;i<list.size();i++) {
			list.get(i).getText();
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equalsIgnoreCase("iphone 13 mini")) {
				
				list.get(i).click();
				System.out.println();
			}
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
