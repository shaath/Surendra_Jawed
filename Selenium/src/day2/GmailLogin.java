package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		//Entering text into email text box
		email.sendKeys("testingtoolstrainer449");
		
//		Sleeper.sleepTightInSeconds(5);
		
		//Clear the text in email text
//		email.clear();
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector(".CwaK9")).click();
	}

}