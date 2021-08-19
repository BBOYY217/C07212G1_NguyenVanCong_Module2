package Bai3_Array_and_method.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length 1");
        int size1 = scanner.nextInt();
        System.out.println("Enter array length 2");
        int size2 = scanner.nextInt();

        int size3 = size1 + size2;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter array element  1 " + " at index " + i);
            arr1[i] = scanner.nextInt();
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter array element 2 " + " at index " + i);
            arr2[i] = scanner.nextInt();
            arr3[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(" " + arr3[i] + " ");
        }
    }
}
