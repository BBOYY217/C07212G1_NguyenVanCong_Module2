package bai11_stack_queue.exercise.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter any string:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Queue<Character> queue = new LinkedList();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder();

        while (!queue.isEmpty()) {
            reverseString.append(queue.remove());
        }

        if (inputString.equals(reverseString.toString())) {
            System.out.println("The input String is a palindrome.");
        } else {
            System.out.println("The input String is not a palindrome.");
        }
    }
}

