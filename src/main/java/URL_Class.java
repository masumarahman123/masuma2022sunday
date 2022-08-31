import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URL_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		
		
		
		
	}

	private static void buffer() {
		// TODO Auto-generated method stub
		
	}

}
