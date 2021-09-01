package bai12_collection_framework.exercise.product_management;

import bai_tap_them.Student.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Edit");
            System.out.println("5. Search by name");
            System.out.println("6. Sort Up By Value");
            System.out.println("7. Sort Down By Value");
            System.out.println("8. Exit");
            System.out.println("Please choose");

            Scanner scanner  = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // them
                    break;
                case 2:
                    // sua thonng tin
                    break;
                case 3:
                   // xoa
                    break;
                case 4:
                   // hien thi
                    break;
                case 5:
                   // tim kiem
                case 8:
                    // tang dan
                    break;
                case 9:
                    // giam dan
                    break;
                default:
                    System.out.println("Choose again");
            }
        }
    }
}
