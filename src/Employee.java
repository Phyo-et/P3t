public class Employee {
    private String name;
    private int employeeID;
    private double basicSalary;
    private static int count =0;

    public Employee(String name, int employeeID, double basicSalary){
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;
        count++;
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
        System.out.println(this.getClass()); //remark => some include package name + class name
        System.out.println("Employee name : "+ this.name);
        System.out.println("Employee ID : "+ this.employeeID);
        System.out.println("Basic Salary : "+ this.basicSalary);
        System.out.println("Actual Salary : "+ this.calculateSalary());
        System.out.println("\n");
    }
}
