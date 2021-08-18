package Bai3_Array.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};

        System.out.println("Delete element you want ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = index; i < N.length - 1; i++) {
            N[i] = N[i + 1];
        }

        N[N.length - 1] = 0;
        System.out.println("After delete :");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");

        }
    }
}

