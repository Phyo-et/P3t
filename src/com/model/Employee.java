package com.model;

public class Employee {
    private String name;
    private int employeeID;
    private double basicSalary;
    private static int count =0;

    public Employee(String name, double basicSalary){
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;
        count++;
        this.employeeID =count;
    }
    public double calculateSalary(){
        return this.basicSalary;
    }
    public double getBasicSalary(){
        return this.basicSalary;
    }
    public static int getCount(){
        return count;
    }
    public void display(){
     //   System.out.println(this.getClass()); //remark => some include package name + class name
        System.out.println("Employee name : "+ name);
        System.out.println("Employee ID : "+ employeeID);
        System.out.println("Basic Salary : "+ basicSalary);
        System.out.println("Actual Salary : "+ calculateSalary());
        System.out.println("\n");
    }
}
