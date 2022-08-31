package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {////div[@id='snacktime']//div[@class='uojl']//input[@id='tea']//div[@id='app2']//div

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6l,TimeUnit.SECONDS);		
		//shadow root open
		//page--htmldom--iframe--shadowdom --element
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("shafgsk");
		driver.findElement(By.cssSelector("#pass")).sendKeys("432sfr567");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("bababa");
		WebElement pp =driver.findElement(By.cssSelector("#inp_val"));
		pp.sendKeys("ma");
		
		
		////WebElement jx=driver.findElement(By.xpath("//*[@id='snacktime']"));
		

		WebElement frame=driver.findElement(By.tagName("iframe"));////iframe[@id='pact']
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		//driver.switchTo().frame(1);
		//Thread.sleep(6000);
		WebElement jx=driver.findElement(By.xpath("//button[text()='Checkout here']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", jx);
		Thread.sleep(6000);
		driver.switchTo().frame("pact");
		WebElement ele=(WebElement) jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		String js="arguments[0].setAttribute('value','Bangladeshi Tea')";
		
		jse.executeScript(js, ele);
		
	
		Thread.sleep(6000);
		driver.quit();
	}

}
