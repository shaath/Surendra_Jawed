package com.Selenium.javaprogrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args)
	{
		ArrayList<Object> s=new ArrayList<Object>();
		 //Writing the data into arralylist
		
		s.add("Selenium");
		s.add("UFT");
		s.add(40000);
		s.add("Apple");
		s.add(2, "Manual");
		s.add(3, "LoadRunner");
		//Size of the array
		System.out.println(s.size());
		
		//Read the data 
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
			
		}
	}

}
