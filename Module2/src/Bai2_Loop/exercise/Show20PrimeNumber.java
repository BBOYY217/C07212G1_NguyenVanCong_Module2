package Bai2_Loop.exercise;

import java.util.Scanner;

public class Show20PrimeNumber {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cho number");
        number = scanner.nextInt();
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println( N);
                count++;
            }
            N++;
        }
    }
}
