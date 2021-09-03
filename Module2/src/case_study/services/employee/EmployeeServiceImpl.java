package case_study.services.employee;

import case_study.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static Scanner scanner= new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Nguyen Van Cong","21/07/2001","Nam","0943796634","zxcv@gmail.com",01,"truong doi","chu tich"));
    }


}
