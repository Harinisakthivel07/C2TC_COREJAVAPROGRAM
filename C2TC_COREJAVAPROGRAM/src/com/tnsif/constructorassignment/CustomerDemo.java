package com.tnsif.constructorassignment;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setId(111);
		c1.setName("HARINI");
		c1.setCity("VILLUPURAM");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		System.out.println(c2);
		
		Customer c3 = new Customer(333,"MADHU","VILLUPURAM");
		System.out.println(c3);
		
		

	}

}
