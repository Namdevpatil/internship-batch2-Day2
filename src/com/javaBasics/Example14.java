package com.javaBasics;

public class Example14 {

	public static void main(String[] args) {
		
		
		int values[] = {10, 38, 29, 47, 17, 44, 35};
		
		for(int i = 0; i < values.length; i++)
		{
			if(i == 3)
			{
				//break;//terminate the loop from given value
				continue;//skip
			}
			System.out.println(values[i]);			
		}
		

	}

}
