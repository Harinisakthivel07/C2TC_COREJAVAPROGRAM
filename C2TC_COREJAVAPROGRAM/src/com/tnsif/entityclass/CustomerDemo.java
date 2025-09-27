package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.setId(101);
		c1.setCname("Harini");
		c1.setCity("Villupuram");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setId (102);
		c2.setCname("Hema");
		c2.setCity ("Villupuram");
		System.out.println(c2);
		 

	}

}
