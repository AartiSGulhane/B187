package com.app;

public class Calculator {
	
	public int  addition()
	{
		int a=20;
		int b=30;
		
		System.out.println(" This is Addition method");
		int res=a+b;
		return res;
	}

	public int subtract()
	{
		int a=35;
		int b=20;
		int res=a-b;
		System.out.println("Subtraction = ");
		return res;
	}
	
	public void Multiplication()
	{
		int a=10;
		int b=5;
		int res=a*b;
		System.out.println("Multiplication = "+res);
	}
	
	public int division()
	{
		System.out.println("This is Division method");
		int a=100;
		int b=25;
		int res=a/b;
		return res;
	}

}
