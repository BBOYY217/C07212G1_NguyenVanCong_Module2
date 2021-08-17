package Bai2_Loop.exercise;

import java.util.Scanner;

public class DisplayImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the isosceles triangle");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int chieuDai, chieuRong;
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Nhập chiều cao");
                    chieuDai = scanner.nextInt();

                    System.out.println("Nhập chiều rộng");
                    chieuRong = scanner.nextInt();
                    for (int i = 0; i < chieuDai; i++) {
                        for (int j = 0; j < chieuRong; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int chieuCao;
                    Scanner scanner1 = new Scanner(System.in);

                    System.out.println("Nhập chiều cao");
                    chieuCao = scanner1.nextInt();

                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);

                    System.out.println("Nhập chiều cao");
                    chieuCao = scanner2.nextInt();
                    for (int i = chieuCao - 1; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
