package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	
	public static Properties pr;
	public static FileInputStream fi;
	public static String prPath="F:\\Morning_830_Batch\\Selenium\\src\\propertyfiles\\orgHRM.properties";
	public static String url="http://opensource.demo.orangehrmlive.com";
	public static String u="Admin",p="admin";
	public static String f="Sharath",l="Chandra";
	public static String ename=f+" "+l,uname=f+l+"12345",pswd=f+l+"12345",cpswd=f+l+"12345";
	@BeforeSuite
	public void org_Launch() throws IOException
	{
		fi=new FileInputStream(prPath);
		pr=new Properties();
		pr.load(fi);
		
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	@AfterTest
	public void org_Logout()
	{
		Sleeper.sleepTightInSeconds(3);
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	

}
