public class ContractEmployee extends Employee{
    private int contractDuration;
    private double contractAmount;
    private static int count =0;

    public ContractEmployee(String name,int employeeID, double basicSalary,int contractDuration,double contractAmount){
        super(name, employeeID, basicSalary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount ;
        count++;
    }
    @Override
    public double calculateSalary(){
        return this.contractAmount/this.contractDuration;
    }
    public static int getCount(){
        return count;
    }
}

