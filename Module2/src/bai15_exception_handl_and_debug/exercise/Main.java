package bai15_exception_handl_and_debug.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        while (!check) {
            try {
                System.out.println("Enter side a");
                double a = scanner.nextInt();

                System.out.println("Enter side b");
                double b = scanner.nextInt();

                System.out.println("Enter side c");
                double c = scanner.nextInt();
                if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                    throw new IllegalTriangleException("cannot enter negative numbers \n" +
                            "The sum of the 2 sides must be greater than the other side");
                } else {
                    check = true;
                    System.out.println("Invalid\n");
                }
            } catch (IllegalTriangleException e) {
                System.out.println("exception " + e.getMessage());
            }
        }
    }

}
