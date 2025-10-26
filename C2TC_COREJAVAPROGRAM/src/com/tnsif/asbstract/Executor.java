package com.tnsif.asbstract;

public class Executor {

	public static void main(String[] args) {
		
		Shopping s1 = new FoodCourt();
		
		s1.shop();
		s1.order();
		
		
		Shopping s2 = new Electronics();
		
		s2.shop();
		s2.order();
		
		
	}

}
