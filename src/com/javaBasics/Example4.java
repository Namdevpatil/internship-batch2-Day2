package com.javaBasics;

public class Example4 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print all the values which are divisible by 
		 * 2 and 5 from the given array of values.
		 * 
		 * int values[] = {10, 38, 29, 47, 17, 44, 35};
		 * 
		 */
		
		int values[] = {10, 38, 29, 47, 17, 44, 35};
		
		for(int i = 0; i < values.length; i++)
		{
			if(values[i]%2 == 0 || values[i]%5 == 0)
			{
				System.out.println(values[i]);
			}
			
		}
		

	}

}
