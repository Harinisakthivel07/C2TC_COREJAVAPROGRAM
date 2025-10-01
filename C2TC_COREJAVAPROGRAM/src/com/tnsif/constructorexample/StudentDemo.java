package com.tnsif.constructorexample;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		s1.setSid(101);
		s1.setName("Harini");
		
		Student s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3=new Student(99,"Harini"); //parameterized constructor
		System.out.println(s3);
		
		

	}

}
