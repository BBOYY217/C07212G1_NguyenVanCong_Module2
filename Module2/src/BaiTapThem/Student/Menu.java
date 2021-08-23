package BaiTapThem.Student;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        while (true) {
            System.out.println(" ");
            System.out.println("Choose function");
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Edit student ");
            System.out.println("4. Find student");
            System.out.println("5. Display");
            System.out.println("6. Exit ");
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
                case 3:
                    StudentManager.edit();
                    break;
                case 4:
                    StudentManager.find();
                    break;
                case 5:
                    StudentManager.display();
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("Choose again");
            }
        }
    }
}
