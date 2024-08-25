package com.model;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private static int count =0;

    public PartTimeEmployee(String name, double basicSalary,int hoursWorked,double hourlyRate){
        super(name, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate =hourlyRate;
        count++;
    }
    @Override
    public double calculateSalary(){
        return this.hoursWorked*this.hourlyRate;
    }
    public static int getCount(){
        return count;
    }
    @Override
    public void display(){
        System.out.println("========Parttime Employee========");
        super.display();
    }
}
