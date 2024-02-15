package com.javaBasics;

public class Example2 {

	public static void main(String[] args) {
		
		int a = 200, b = 150, c = 300;
		
		boolean condition1 = (a>b && c>=b) || (c>b || a==c);
						  // (true && true) || (true || false)
						  // true || true => true
		
		System.out.println(condition1);

	}

}
