package case_study.controller;


import case_study.services.customer.CustomerServiceImpl;
import case_study.services.employee.EmployeeServiceImpl;
import case_study.services.facility.FacilityService;
import case_study.services.facility.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("Welcome to Furama Resort menu: ");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.println("Please enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        while (true) {
            switch (choice) {
                case 1: {
                    System.out.println("1.Employee Management");
                   EmployeeController.displayEmployeeMenu();
                    break;
                }
                case 2: {
                    System.out.println("2.Customer Management");
                    CustomerController.displayCustomerMenu();
                    break;
                }
                case 3: {
                    System.out.println("3.Facility Management ");
                    FacilityController.displayFacilityMenu();
                    break;
                }
                case 4: {
                    System.out.println("4.Booking Management");
                    System.out.println(
                            "1:Add new booking\n" +
                                    "2:Display list booking\n" +
                                    "3:Create new constracts\n" +
                                    "4:Display list contracts\n" +
                                    "5:Edit contracts\n" +
                                    "6:Return main menu\n");
                    break;
                }
                case 5: {
                    System.out.println("5.Promotion Management");
                    System.out.println(
                            "1:Display list customers use service\n" +
                                    "2:Display list customers get voucher\n" +
                                    "3:Return main menu\n");
                    break;
                }
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please enter from 1 to 6:");
            }

        }
    }






}
