package com.javaBasics;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) 
	{

		/**
		 * 
		 * Write a java program to validate whether the person is major or minor, 
		 * based on his/her age.
		 *  
		 */

		int age;
		
		Scanner scanner = new Scanner(System.in);//read statement
		
		System.out.println("enter the person age: ");
		age = scanner.nextInt();
		
		scanner.close();

		if(age >= 18)
		{
			System.out.println("the person is major");
		}
		else
		{
			System.out.println("the person is minor");
		}

	}

}
