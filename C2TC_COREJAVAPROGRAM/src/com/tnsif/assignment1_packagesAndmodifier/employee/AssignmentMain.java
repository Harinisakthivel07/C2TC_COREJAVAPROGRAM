package com.tnsif.assignment1_packagesAndmodifier.employee;

public class AssignmentMain {

	public static void main(String[] args) {
		  Employee e; 

	       
	        e = new Manager("Harini", 100, 70000, "HR");
	        
	        if (e instanceof Manager) {
	            System.out.println("Manager Details: " + e);
	        }

	        
	        e = new Developer("Gopi", 110, 60000, "Core Java");
	        
	        if (e instanceof Developer) {
	        	
	            System.out.println("Developer Details: " + e);
	        }

	}

}
