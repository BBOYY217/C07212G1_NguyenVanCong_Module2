package bai11_stack_queue.exercise.Convert;

import java.util.Scanner;
import java.util.Stack;
import static java.lang.Math.pow;


public class Binary {
    public static void BinaryToDecimal (int number) {
        Stack<Double> doubles = new Stack<>();
        double temp = 0;
        int count = 0;
        double digit;
        while(number > 0){
            digit = number % 10;
            temp += digit * pow(2,count);
            doubles.push(temp);
            number = number / 10;
            count++;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int number= Integer.parseInt(scanner.nextLine());
        BinaryToDecimal (number);
    }
}
