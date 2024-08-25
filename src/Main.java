import com.model.Employee;
import com.service.EmployeeRegisterationService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        EmployeeRegisterationService service =new EmployeeRegisterationService();

        service.getEmployeesInfo();

        for (int i=0;i<Employee.getCount();i++){
            service.employeeDB[i].display();
        }
    }
}