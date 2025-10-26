package com.tnsif.day6staticexamples;

public class MultipleStaticBlocks {
	
	//INSTANCE BLOCKS
	{
		System.out.println("INSTANCE BLOCK 1");
	}
	{
		System.out.println("INSTANCE BLOCK 2");
	}
	
	//STATIC BLOCKS
	static 
	{
		System.out.println("STATIC BLOCK 1");
	}
	static 
	{
		System.out.println("STATIC BLOCK 2");
	}

	public static void main(String[] args) {
		new MultipleStaticBlocks();

	}
}
