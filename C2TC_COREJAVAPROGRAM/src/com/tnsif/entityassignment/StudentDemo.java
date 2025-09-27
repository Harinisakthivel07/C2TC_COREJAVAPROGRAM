package com.tnsif.entityassignment;

public class StudentDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1 = new Student();
        s1.setRollNo(29);
        s1.setName("HARINI");
        s1.setDepartment("ECE");

        
        Student s2 = new Student();
        s2.setRollNo(48);
        s2.setName("MADHU");
        s2.setDepartment("ECE");

        
        Student s3 = new Student();
        s3.setRollNo(34);
        s3.setName("ISMATH");
        s3.setDepartment("ECE");

      
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

	}

}
