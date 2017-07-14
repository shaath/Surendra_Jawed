package com.Selenium.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		int[] s=new int[5];
		
		System.out.println(s.length);

		//Writing the data into array
		s[3]=50000;
		s[0]=40000;
		s[3]=60000;
		
		//Reading the data from an array
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
	}

}
