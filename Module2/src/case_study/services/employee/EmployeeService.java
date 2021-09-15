package case_study.services.employee;

import case_study.model.Employee;
import case_study.services.Service;

public interface EmployeeService extends Service<Employee> {


    void showList();

    void display();

    void add();
}
