package bai3_array_and_method.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};

        System.out.println("Delete element you want ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;
        System.out.println("After delete :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
