package BaiTapThem.Money;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. USD exchange to VND ");
            System.out.println("2. VND exchange to USD ");
            System.out.println("3. Exit");
            System.out.println("Enter You choice :");
            choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("enter your USD");
                        float USD = Float.parseFloat(scanner.nextLine());
                        float VND = 23000 * USD;
                        System.out.println("Vnd = " + VND);
                        break;

                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("enter your VND");
                        float vnd = Float.parseFloat(scanner2.nextLine());
                        float usd = vnd / 23000;
                        System.out.println("USD = " + usd);
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Error");
                }
        }
    }
}
