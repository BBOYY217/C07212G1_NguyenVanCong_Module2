package case_study.controller;

import case_study.services.employee.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("1.Display list employees\n");
            System.out.println("2.Add new employee\n");
            System.out.println("3.Edit employee\n");
            System.out.println("4.Delete employee\n");
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
//                    employeeService.edit();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("choose again");
            }
        }
    }
}
