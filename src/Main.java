//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new PartTimeEmployee("Min Min",001,0.0,28,200);
        Employee emp2 = new FullTimeEmployee("NiNi",101,1500,300,500);
        Employee emp3 = new ContractEmployee("Bobo",301,0.0,6,30000);
        Employee emp4 = new FullTimeEmployee("tun tun",601,2500,500,0.0);

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();

        System.out.println("Total Employee : "+Employee.getCount());
        System.out.println("Total Fulltime Employee : "+FullTimeEmployee.getCount());
        System.out.println("Total Contract Employee : "+ContractEmployee.getCount());
        System.out.println("Total Parttime Employee : "+PartTimeEmployee.getCount());
    }
}