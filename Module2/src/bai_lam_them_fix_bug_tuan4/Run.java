package bai_lam_them_fix_bug_tuan4;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose function\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.Exit");
            System.out.println("Choose");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                   // code thêm mới
                    StudentManager.add();
                    break;
                case 2:
                    // hiện thị
                    StudentManager.display();
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
}
