package bai11_stack_queue.exercise.reverse_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter array length ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array element " + " at index " + i);
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Array after using push() " + "\n" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Array after using pop() " + "\n" + Arrays.toString(array));

    }
}
