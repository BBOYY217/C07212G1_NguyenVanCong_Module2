package case_study.services.customer;

import case_study.model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Enter identity card ");
        int idCard = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter full name");
        String name = scanner.nextLine();

        System.out.println("Enter day of birth ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Enter gender");
        String gender = scanner.next();

        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email");
        String email = scanner.nextLine();

        System.out.println("Enter customer type");
        String customerType = scanner.nextLine();

        System.out.println("Enter address");
        String address = scanner.nextLine();

        Customer customer = new Customer(idCard,name,dayOfBirth,gender,phoneNumber,email,customerType,address);
        customerList.add(customer);

        System.out.println("Added new customer success");
    }

//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
}
