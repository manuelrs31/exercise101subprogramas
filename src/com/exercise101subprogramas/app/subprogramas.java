package com.exercise101subprogramas.app;

import java.util.Scanner;

public class subprogramas {

	public static void main(String[] args) 
	{
		// variables declaration
		int num1=0;
		int num2=0;
		int res=0;
		
		
		//objects  declaration
		Scanner input = new Scanner(System.in);
		tunedmessage("ale");
		
		
		System.out.println("dame un numero");
		message();
		num1 = input.nextInt();
		System.out.println("dame otro numero");
		message();
		num2 = input.nextInt();
		
		res=num1+num2;
		
		System.out.println("el resultado es = "+res);

	}
	
	//method to ask number
	public static void message()
	{
		System.out.println("input a number");
	}
	
	//method to tuned message
	public static String tunedmessage(String message)
	{
		return "hola"+message;
	}
	
	//method to add numbers
	public static int addnumbers(int num1, int num2)
	{
		return num1+num2;
		
	}

}
