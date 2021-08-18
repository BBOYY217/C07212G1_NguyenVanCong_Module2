package Bai3_Array.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.println("Element X");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println("Add element at index");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = index ; i < N.length; i++) {
            N[i]= X;
        }
        System.out.println("After add delete :");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");

        }

    }

}
