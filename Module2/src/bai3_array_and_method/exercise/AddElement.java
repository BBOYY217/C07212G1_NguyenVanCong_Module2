package bai3_array_and_method.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};


        System.out.println("Element X");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println("Add element at index");
        int index = Integer.parseInt(scanner.nextLine());

        int[] newArr =  new int[arr.length];
        for (int i = 0; i < index -1; i++) {
            newArr[i] = arr[i];
        }

        newArr[index - 1] = X;
        for (int i = index; i <newArr.length ; i++) {
            newArr[i]=arr[i-1];
        }

        System.out.println("New array ");
        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i]+" ");

        }
;    }
}

