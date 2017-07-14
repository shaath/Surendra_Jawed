package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicMethodsEg 
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg b=new BasicMethodsEg();
		b.function3();
		
		boolean flag=b.function4();
		System.out.println(flag);
	}
	
	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}

	//static Method with returning value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non static method without returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static Method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	//Taking Screenshot
	public void screenshot(String name) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Morning_830_Batch\\Selenium\\src\\screenshots\\"+name+".png"));
	}
	//Launching the browser
	public void launch_Br_App(String br,String url)
	{
		if (br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
	}
	
	//Sending the text into textbox
	public void send_text(String Loc, String value, String text,String Ops)
	{
		WebElement ident = null;
		if (Loc.equalsIgnoreCase("id"))
		{
			ident=driver.findElement(By.id(value));
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			ident=driver.findElement(By.name(value));
		}
		else if (Loc.equalsIgnoreCase("classname"))
		{
			ident=driver.findElement(By.className(value));
		}
		else if (Loc.equalsIgnoreCase("tagname"))
		{
			ident=driver.findElement(By.tagName(value));
		}
		else if (Loc.equalsIgnoreCase("Linktext"))
		{
			ident=driver.findElement(By.linkText(value));
		}
		else if (Loc.equalsIgnoreCase("partiallinktext"))
		{
			ident=driver.findElement(By.partialLinkText(value));
		}
		else if (Loc.equalsIgnoreCase("xpath"))
		{
			ident=driver.findElement(By.xpath(value));
		}
		else if (Loc.equalsIgnoreCase("cssselcetor")) 
		{
			ident=driver.findElement(By.cssSelector(value));
		}
		
		if (Ops.equalsIgnoreCase("sendtext"))
		{
			ident.sendKeys(text);
		}
		else if (Ops.equalsIgnoreCase("click"))
		{
			ident.click();
		}
		
	}
	
}
