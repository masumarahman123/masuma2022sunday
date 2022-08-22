package MasumaMaven.MasumaMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBanna {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6l, TimeUnit.SECONDS);
		

		//Assertion
		driver.findElement(By.xpath("//a[text()='Register']")).click();
				String actualresult=driver.findElement(By.xpath("//h1[text()='Signing up is easy!']")).getText();
					System.out.print(actualresult);	
						String expected="Signing up is easy!";
						Assert.assertEquals(actualresult, expected);
				
		/*
		 //Register...
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Firefox");
		driver.findElement(By.id("customer.lastName")).sendKeys("asd1234!@#");
		driver.findElement(By.id("customer.address.street")).sendKeys("1000se,189st");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("New York");
		driver.findElement(By.id("customer.address.state")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("11372");
		driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("954/234/2987");
		driver.findElement(By.id("customer.ssn")).sendKeys("457 56586");
		driver.findElement(By.id("customer.username")).sendKeys("Lalala12");		
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("user1234nn12");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("user1234nn12");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	
		Thread.sleep(6000);
		*/
		
		
	/*	
//login
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Bonogracia");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("7654!@#asd");		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(6000);
		
		*/
		

		//driver.quit();
	}

}
