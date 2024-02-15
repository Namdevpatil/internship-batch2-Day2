package com.javaBasics;

public class Example11 {

	public static void main(String[] args) {

		/**
		 * Write a java program to print all the values of not even number from the given array of values.
		 * 
		 * int values[] = {10, 38, 29, 47, 17, 44, 35};
		 * 
		 */

		int values[] = {10, 38, 29, 47, 17, 44, 35};

		/*
		 * for(int i = 0; i < values.length; i++) { System.out.println(values[i]); }
		 */

		//1 cr values
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[4]);
		System.out.println(values[5]);
		System.out.println(values[6]);
		
		System.out.println("----------------------");
		
		for(int i = 0; i < values.length; i++)
			System.out.println(values[i]);
		
		

	}

}
