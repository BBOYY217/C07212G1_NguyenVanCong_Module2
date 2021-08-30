package bai11_stack_queue.exercise.reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter string");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder string = new StringBuilder();
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            string.append(stack.pop());
        }
        System.out.println(" String has been reversed " + "\n" + string.toString());
    }
}
