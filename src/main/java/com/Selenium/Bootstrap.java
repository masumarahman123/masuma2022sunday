package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6000l,TimeUnit.SECONDS);		
		//goto frame 1st
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//x-path of non select button
		driver.findElement(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label")).click();
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a"));
		for(int i=0;i<list.size();i++) {
			list.get(i).getText();
			System.out.println(list.get(i).getText());
			//single option select korar jonno
			//if(list.get(i).getText().equalsIgnoreCase("Bootstrap")) {
			//	list.get(i).click();
			//}
			//while(!list.get(i).isSelected()) {//---! nagation/not
			//list.get(i).click();}
			
			if(list.get(i).getAttribute("class").equalsIgnoreCase("active")) {
				System.out.println(list.get(i).getText());
			}
			else {list.get(i).click();}
		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
