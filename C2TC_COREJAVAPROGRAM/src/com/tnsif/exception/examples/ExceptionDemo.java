package com.tnsif.exception.examples;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x[] = {23,45,11};
		int c;
		try {
			
			c = x[4]; //EXCEPTION OBJECT THRROWING
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			c = x[2];
			System.out.println("C="+c);
			
		}
		System.out.println("NEXT LINE");
		
	}

}
