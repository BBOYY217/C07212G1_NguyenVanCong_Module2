package bai12_collection_framework.exercise.product_management;

import bai_tap_them.Student.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Search by name");
            System.out.println("6. Sort Up By Value");
            System.out.println("7. Sort Down By Value");
            System.out.println("8. Exit");
            System.out.println("Please choose");

            Scanner scanner  = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ProductManager.add();
                    break;
                case 2:
                    ProductManager.editProduct();
                    break;
                case 3:
                   ProductManager.deleteProduct();
                    break;
                case 4:
                   ProductManager.display();
                    break;
                case 5:
                    ProductManager.search();
                case 6:
                    ProductManager.priceIncrease();
                    break;
                case 7:
                    ProductManager.reducedPrice();
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("Choose again");
            }
        }
    }
}
