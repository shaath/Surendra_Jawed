package com.Selenium.javaprogrammes;

public class NestedIF 
{
	public static void main(String[] args)
	{
		int a=50;
		int b=400;
		int c=60;
		
		if (a > b & a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
