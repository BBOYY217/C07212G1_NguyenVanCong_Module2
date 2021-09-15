package case_study.controller;

import case_study.services.customer.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choise = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("1.Display list customers\n");
            System.out.println("2.Add new customer\n");
            System.out.println("3.Edit customer\n");
            System.out.println("4.Return main menu\n");
            switch (choise) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
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
