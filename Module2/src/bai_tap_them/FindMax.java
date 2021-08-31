package bai_tap_them;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static int[] findMax(int[][] array) {
        int[] total = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                total[i] = max;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter row");
        int rowArray = Integer.parseInt(scanner.nextLine());

        System.out.println("enter colum");
        int columnArray = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowArray][columnArray];
        int[] result;

        for (int i = 0; i < rowArray; i++) {
            for (int j = 0; j < columnArray; j++) {
                System.out.println("enter element at position index " + i + " " + j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < rowArray; i++) {
            for (int j = 0; j < columnArray; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        result = findMax(matrix);
        System.out.println(Arrays.toString(result));
    }
}
