package bai17_binary_and_serialization.exercise.product_management;

import bai17_binary_and_serialization.practice.Student;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        while(true){
            System.out.println("Choice menu");
            System.out.println("1. Add ");
            System.out.println("2. Search ");
            System.out.println("3. Display ");
            System.out.println("4. Exit ");

            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    Manager.add();
                    break;
                case 2:
                    Manager.search();
                    break;
                case 3:
                    Manager.display();
                    break;
                case 4:
                    System.exit(4);
                    break;

            }
        }
    }
}

