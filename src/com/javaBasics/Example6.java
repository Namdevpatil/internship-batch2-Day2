package com.javaBasics;

public class Example6 {

	public static void main(String[] args) {

		/**
		 * Write a java program to print all the values of not even number from the given array of values.
		 * 
		 * int values[] = {10, 38, 29, 47, 17, 44, 35};
		 * 
		 */

		int values[] = {10, 38, 29, 47, 17, 44, 35};

		for(int i = 0; i < values.length; i++)
		{
			if(values[i]%2 != 0)
				System.out.println(values[i]);
		}


	}

}
