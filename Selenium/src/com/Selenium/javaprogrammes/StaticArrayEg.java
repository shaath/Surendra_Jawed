package com.Selenium.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		Object[] salary={20000,"Selenium",'M',false,30000,5555};
		
		//Length of the array
		
		System.out.println(salary.length);
		//Reading the data from array
		
//		System.out.println(salary[2]);
		
		for (int i = 0; i < salary.length; i++) 
		{
			System.out.println(salary[i]);
			
		}

//		for (int data : salary) 
//		{
//			System.out.println(data);
//		}
	}

}
