package BaiTapThem.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose function");
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Edit student ");
            System.out.println("4. Display");
            System.out.println("5. Exit ");
            System.out.println("Please choose");

            Scanner scanner  = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.delete();
                    break;
                case 4:
                    StudentManager.display();
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Choose again");
            }
        }
    }
}
