package com.javaBasics;

public class Example3 {

	public static void main(String[] args) {
		
		int a = 200, b = 150, c = 300;
		
		boolean condition1 = (a>b && !(c == b)) || (c>b || !(a<c));
						  
		System.out.println(condition1);

	}

}
