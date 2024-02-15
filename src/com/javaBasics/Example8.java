package com.javaBasics;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) 
	{

		/**
		 * 
		 * Write a java program to validate whether the given number is positive or negative, 
		 * if that number is positive then check the number is even or odd.
		 *  
		 */

		int number;
		
		Scanner scanner = new Scanner(System.in);//read statement
		
		System.out.println("enter the value: ");
		number = scanner.nextInt();
		
		scanner.close();
		
		//nested if-else condition
		
		//outer if condition
		if(number > 0)
		{
			
			//inner if condition
			if(number%2 == 0)
			{
				System.out.println("the number is an even.");
			}
			else
			{
				System.out.println("the number is an odd.");
			}
		}
		else
		{
			System.out.println("negative");
		}

	}

}
