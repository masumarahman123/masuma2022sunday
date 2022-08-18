package com.Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_one {
	
	//
//...//input[@value='radio2']..//radio button index follow kortesa
	////input[@id='autocomplete']...hello
	////select[@id='dropdown-class-example']..select
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//3.141.59 version er wait
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);//Dynamic Wait/GlobalWait
//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000l));
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000l));
		String w= driver.getTitle();
		System.out.println(w);		
		Thread.sleep(3000);//static Wait
		
		//click radio button
		//driver.findElement(By.cssSelector("input[value='radio2']")).click();/css..1.no //  2. no @
		driver.findElement(By.name("radioButton")).click();				
		Thread.sleep(2000);
		boolean b=driver.findElement(By.name("radioButton")).isSelected(); 
		Assert.assertTrue(b);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello");
		//or..driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(2000);
		
		//Assert.assertTrue(b);
		//3.141.59
		
		
		WebElement r=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select=new Select(r);
		
		select.selectByVisibleText("Option1");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement x=driver.findElement(By.xpath("//*[text()='Mouse Hover']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;		
		js.executeScript("arguments[0].scrollIntoView;", x);
		
		Actions action=new Actions(driver);
		action.moveToElement(x).perform();
		
		WebElement t=driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
		
		Thread.sleep(3000);
		action.moveToElement(t).click().perform();
		Thread.sleep(3000);
		driver.quit();
		
	
	
	}
	
	
	
	

}




