package com.tnsif.entityassignment;

public class Student {
	private int rollNo;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + ", Department=" + department + "]";
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}
