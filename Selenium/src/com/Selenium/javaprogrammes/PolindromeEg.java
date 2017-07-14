package com.Selenium.javaprogrammes;

public class PolindromeEg {

	public static void main(String[] args) 
	{
		String s="QEdge";//malayalaM
		String r="";
		int len=s.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);		

		if (s.equalsIgnoreCase(r))
		{
			System.out.println("The given string is a polindrome");
		}
		else
		{
			System.out.println("The given String is not a polindrome");
		}
	}

}
