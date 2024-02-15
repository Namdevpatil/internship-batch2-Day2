package com.javaBasics;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) 
	{

		/**
		 * 
		 * Write a java program to get the student grade, based on the marks obtain out of 100.
		 *  
		 */

		int marks;
		
		Scanner scanner = new Scanner(System.in);//read statement
		
		System.out.print("enter the student marks");
		System.err.println("(*out of 100): ");
		marks = scanner.nextInt();
		
		scanner.close();
		
		//else-if ladder		
		
		if(marks <= 100 && marks > 70)//70-100
		{
			System.out.println("distinction");			
		}
		else if(marks <= 70 && marks > 60)//60-70
		{
			System.out.println("first class");			
		}
		else if(marks <= 60 && marks > 50)//50-60
		{
			System.out.println("second class");			
		}
		else if(marks <= 50 && marks >= 41)//41-50
		{
			System.out.println("third class");			
		}
		else if(marks == 40)//40
		{
			System.out.println("pass");			
		}
		else
		{
			System.out.println("fail");
		}

	}

}
