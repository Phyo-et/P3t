package com.service;

import com.model.ContractEmployee;
import com.model.Employee;
import com.model.FullTimeEmployee;
import com.model.PartTimeEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeRegisterationService {
    public Employee[] employeeDB =new Employee[100];
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private double salary;
    private String type;

    public void getEmployeesInfo() throws IOException {
        String flag;
        do {
        this.commonEmployeeInfo();

        if ("contract".equalsIgnoreCase(this.type)) {
            employeeDB[Employee.getCount()] = this.getContractEmpInfo();
        } else if ("fulltime".equalsIgnoreCase(this.type)) {
            employeeDB[Employee.getCount()] = this.getfulltimeEmpInfo();
        } else if ("parttime".equalsIgnoreCase(this.type)) {
            employeeDB[Employee.getCount()] = this.getParttimeEmpInfo();
        }
        System.out.print("Do u want to Add new Employee (Yes/No)? :");
        flag = br.readLine();
     }while(flag.equalsIgnoreCase("yes"));
    }
    public void commonEmployeeInfo() throws IOException {
        System.out.print("Enter Employee name : "  );
        this.name = br.readLine();
        System.out.print("Enter Employee Basic Salary : "  );
        this.salary= Double.parseDouble(br.readLine());
        System.out.print("Enter Employee type : (Contract/Fulltime/Parttime)");
        this.type = br.readLine();

    }
    public FullTimeEmployee getfulltimeEmpInfo() throws IOException {
        System.out.print("Enter the allowence :");
        double allowence = Double.parseDouble(br.readLine());
        System.out.print("Enter the bonus :");
        double bonus = Double.parseDouble(br.readLine());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(this.name,this.salary,allowence,bonus);
        return fullTimeEmployee;
    }

    public PartTimeEmployee getParttimeEmpInfo() throws IOException {
        System.out.print("Enter the Worked hour : ");
        int hourWorked = Integer.parseInt(br.readLine());
        System.out.print("Enter the Hourly rate : ");
        double rate =Double.parseDouble(br.readLine());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(this.name,this.salary,hourWorked,rate);
        return partTimeEmployee;
    }
    public ContractEmployee getContractEmpInfo() throws IOException {
        System.out.print("Enter Contract duration : ");
        int duration =Integer.parseInt(br.readLine());
        System.out.print("Enter Contract Amount : ");
        Double amount= Double.parseDouble(br.readLine());

        ContractEmployee contractEmp = new ContractEmployee(this.name,this.salary,duration,amount);
        return contractEmp;
    }

}
