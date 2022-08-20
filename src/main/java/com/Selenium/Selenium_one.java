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
	
	
//...//input[@value='radio2']..//radio button index follow kortesa
	////input[@id='autocomplete']...hello
	////select[@id='dropdown-class-example']..select
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//3.141.59 version er wait
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);//Dynamic Wait/GlobalWait
//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000l));
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000l));
		
		String actual= driver.getTitle();
		System.out.println(actual);
		String expected="Practice Page";
		Thread.sleep(3000);//static Wait
		Assert.assertEquals(actual, expected);
		
		
		//click radio button
		//driver.findElement(By.cssSelector("input[value='radio2']")).click();/css..1.no //  2. no @
		driver.findElement(By.name("radioButton")).click();				
		Thread.sleep(2000);
		boolean b=driver.findElement(By.name("radioButton")).isSelected(); 
		Assert.assertTrue(b);
		/*//Assert.assertFalse(b); hard assertion negitive
		while(b) {
			System.out.println("radio botton has been click");
			break;}
			*/
		
		//Suggession Class Example
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello");
		//or..driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(2000);
		
		
		
		
		//dropdown select 
		WebElement r=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));//select er path		
		Select select=new Select(r);		
		select.selectByVisibleText("Option1");//select korlam option one
		//....
		
		//Checkbox Example
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());//false
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());//true
	boolean cheekbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		Assert.assertTrue(cheekbox);
		Thread.sleep(3000);
		
		//alert accept
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		String message=driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		if(message.equalsIgnoreCase("Hello , share this practice page and share your knowledge")) {
			driver.switchTo().alert().accept();	
		}
		else {System.out.println("Thats not acurrect alert");}
		System.out.println("get text..."+ message);
		//boolean text=driver.switchTo().alert().accept();
		//Assert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("masuma");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//input[@class='inputs']")).clear();
		
		
		
		
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
		
	//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
	
	}
	
	
	
	

}




