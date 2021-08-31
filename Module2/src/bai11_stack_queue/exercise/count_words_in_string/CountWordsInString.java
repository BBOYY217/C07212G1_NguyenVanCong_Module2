package bai11_stack_queue.exercise.count_words_in_string;

import java.util.*;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        System.out.println("Enter string");
        String input = scanner.nextLine().toLowerCase();

        String[] word = input.split(" ");

        for (String string : word) {
            int count = 1;
            for (String string1 : map.keySet()) {
                if (string1.equals(string)) {
                    count = map.get(string1) + 1;
                }
            }
            map.put(string, count);

        }
        System.out.println(map);
    }
}

