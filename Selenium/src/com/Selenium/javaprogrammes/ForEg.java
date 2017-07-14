package com.Selenium.javaprogrammes;

public class ForEg {

	public static void main(String[] args)
	{
//		for(int i=1; i <= 10 ; i++)
//		{
//			System.out.println("HI");
//		}
		
		for (int i = 1; i <= 100; i++) 
		{
			System.out.println(i);
			if (i == 75) 
			{
				break;
			}
		}
		System.out.println("*****");
		for (int i = 100; i >= 1; i--) 
		{
			System.out.println(i);
			
		}

	}

}
