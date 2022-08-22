package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL {
// Secure Sockets Layer, a standard security protocol that enables encrypted communication between a client (web browser) and a server (webserver).
	//need SSL for three reasons: privacy, integrity, and identification.
/*
 * SSL helps to keep sensitive information like usernames, passwords, credit cards, etc. secure by encrypting the data between the client and the server. You need SSL for three reasons: privacy, integrity, and identification.

An SSL certificate helps a browser verify the identity of a website. By using the SSL certificates, the browser can ensure that it is connected to the exact website the user intended to. SSL certificates guarantee that you are the legitimate and verified owner of the website.
 */

	public static void main(String[] args) {
		/**
		 * What is a bad SSL certificate?
An SSL certificate error occurs when the browser cannot verify 
the SSL certificates returned by the server. 

		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6l,TimeUnit.SECONDS);
		
		driver.get("https://expire.badssl.com/");
		
		ChromeOptions cop=new ChromeOptions();
		cop.setAcceptInsecureCerts(true);
		cop.setAcceptInsecureCerts(false);
		WebDriver driver1=new ChromeDriver(cop);
		
	}

}
