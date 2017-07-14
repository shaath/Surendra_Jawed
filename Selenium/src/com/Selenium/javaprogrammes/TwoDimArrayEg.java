package com.Selenium.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		
		System.out.println("The size of the rows "+x.length);
		System.out.println("The 0th row columns size is "+x[0].length);
		
		//writing the data into array
		x[0][1]="Selenium";
		x[1][2]=40000;
		
		//Read the data from array
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
