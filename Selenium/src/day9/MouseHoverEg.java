package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement dep=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(dep).build().perform();
		Sleeper.sleepTightInSeconds(3);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		
		act.moveToElement(books).build().perform();
		Sleeper.sleepTightInSeconds(3);

		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/a[5]/span")).click();
	}

}
