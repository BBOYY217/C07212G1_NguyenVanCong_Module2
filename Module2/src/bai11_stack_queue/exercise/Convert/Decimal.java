package bai11_stack_queue.exercise.Convert;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void DecimalToBinary(int number) {
        Stack<Integer> myStack = new Stack<>();
        while (number != 0) {
            int modOfNumber = number % 2;
            myStack.push(modOfNumber);
            number /= 2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int number = Integer.parseInt(scanner.nextLine());
        DecimalToBinary(number);
    }
}
