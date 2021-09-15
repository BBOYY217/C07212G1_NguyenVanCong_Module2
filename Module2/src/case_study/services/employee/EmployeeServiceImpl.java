package case_study.services.employee;

import case_study.model.Employee;
import com.sun.media.sound.EmergencySoundbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void showList(){
        for (int i = 0; i < employeeList.size() ; i++) {
            System.out.println();
        }
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Enter identity card ");
        int idCard = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter full name");
        String name = scanner.nextLine();

        System.out.println("Enter day of birth ");
        int daOfBirth = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter gender");
        String gender = scanner.next();

        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email");
        String email = scanner.nextLine();

        System.out.println("Enter id staff");
        int idStaff = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter academic level ");
        String academicLevel = scanner.nextLine();

        System.out.println("Enter staff position");
        String staffPosition = scanner.next();

        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(idCard, name, daOfBirth, gender, phoneNumber, email, idStaff, academicLevel, staffPosition, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
//        for (int i = 0; i < employeeList.size() ; i++) {
//            if(id == employeeList.get(i).getIdCard() ){
//                Employee employee = employeeList.get(i);
//                System.out.println("Enter identity card ");
//                employee.setIdCard();
//            }
//        }
    }

    @Override
    public void delete() {

    }
}
