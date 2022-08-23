package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_3rd_dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6000l,TimeUnit.SECONDS);		
		//goto frame 1st
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.tagName("iframe"));
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		driver.switchTo().frame(frame);		
		//ajecc 
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println(source);
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		System.out.println(target);
		//we will do drag and drop using Actions() class+build().perform();//buld for multiform work		
		Actions ac=new Actions(driver);
		
		ac.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();//click drggable
		
		driver.quit();
/**
 * org.openqa.selenium.NoSuchElementException
 * Beasuse:
 * 1.did not get time to upload
 * 2.might be hidden in another element
 * 3.the element may be hiden one html to another htlm
 * 4. a html is embeded by another html
 * 
 * 
 * 
 * 
 */
	}

}
