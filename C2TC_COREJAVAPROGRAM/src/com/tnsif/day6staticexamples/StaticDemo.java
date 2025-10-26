package com.tnsif.day6staticexamples;

public class StaticDemo {
	//instance block
	{
		System.out.println("Instance Block");
	}
	//static block
	static
	{
		System.out.println("Welcome to Static Block");
	}

	public static void main(String[] args) 
	{
		//StaticDemo s = new StaticDemo();
		//StaticDemo s1 = new StaticDemo();
		System.out.println("Main Block..");
		
	}
	static
	{
		System.out.println("STATIC BLOCK");
	}

}
