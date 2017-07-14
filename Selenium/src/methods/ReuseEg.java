package methods;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException 
	{
		BasicMethodsEg bm=new BasicMethodsEg();
		
//		bm.function1();
//		
//		int res=bm.sum(60,40);
//		System.out.println(res);

		bm.launch_Br_App("ie","http://opensource.demo.orangehrmlive.com");
		
//		bm.screenshot("yahoo");
		bm.send_text("id", "txtUsername", "Admin","sendtext");
		bm.send_text("id", "txtPassword", "admin","sendtext");
		bm.send_text("id", "btnLogin", "", "click");
		
	}

}
