package BaiTapThem.Student;

import java.util.Scanner;

public class StudentManager {

    public static Scanner scanner = new Scanner(System.in);
    public static Student[] studentList;

    static {
        System.out.println("Enter the length of the array");
        studentList = new Student[Integer.parseInt(scanner.nextLine())];
        studentList[0] = new Student(1, "Cong", 20, "C07");
        studentList[1] = new Student(2, "Tinh", 21, "C07");
        studentList[2] = new Student(3, "Sang", 27, "C07");
    }

    public static void display() {
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
    }

    public static void add() {
        System.out.println("ID :");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Name :");
        String name = scanner.nextLine();

        System.out.println("Age :");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Classes :");
        String classes = scanner.nextLine();

        for (int i = 0; i < studentList.length; i++) {
            Student student = new Student(id, name, age, classes);
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public static void delete() {
        System.out.println("Enter the id you want to delete ");
        int Id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getId() == Id && studentList[i] instanceof Student) {
                studentList[i].setId(0);
                studentList[i].setName(null);
                studentList[i].setAge(0);
                studentList[i].setClasses(null);
                break;
            }
        }
    }

    public static void edit() {
        System.out.println("ID :");
        int newId = Integer.parseInt(scanner.nextLine());

        System.out.println("Name :");
        String newName = scanner.nextLine();

        System.out.println("Age :");
        int newAge = Integer.parseInt(scanner.nextLine());

        System.out.println("Classes :");
        String newClass = scanner.nextLine();

        for (int i = 0; i < studentList.length; i++) {
            if (newId == studentList[i].getId() && studentList[i] instanceof Student) {
                studentList[i].setId(newId);
                studentList[i].setName(newName);
                studentList[i].setAge(newAge);
                studentList[i].setClasses(newClass);
                break;
            } else if (newId == studentList[i].getId()) {
                System.out.println("Same ID");
            }
        }
    }

    public static void find(){
        System.out.println("looking for students");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.length ; i++) {
            if (studentList[i].getId() == number){
                System.out.println(studentList[i]);
            }
        }
    }


}