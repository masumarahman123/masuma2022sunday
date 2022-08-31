package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Mousehover_Actions {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);
		

		WebElement jx=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;		
		js.executeScript("arguments[0].scrollIntoView();", jx);
		
		Actions action=new Actions(driver);
		action.moveToElement(jx).perform();		
		WebElement t=driver.findElement(By.xpath("//a[text()='Reload']"));		
		Thread.sleep(3000);
		action.moveToElement(t).click().perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
