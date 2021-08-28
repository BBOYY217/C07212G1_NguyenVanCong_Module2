package bai_tap_them.Student;

import java.util.Scanner;

public class StudentManager {

    public static Scanner scanner = new Scanner(System.in);
    public static Student[] studentList;

    static {
        System.out.println("Enter the length of the array");
        studentList = new Student[Integer.parseInt(scanner.nextLine())];
        studentList[0] = new Student(1, "Cong", 20, "C07",null);
        studentList[1] = new Student(2, "Tinh", 21, "C07",null);
        studentList[2] = new Student(3, "Sang", 27, "C07",null);
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

        Address address = new Address();

        System.out.println("Apartment Number :");
        address.setApartmentNumber(scanner.nextLine());

        System.out.println("Stress :");
        address.setStress(scanner.nextLine());

        System.out.println("Ward :");
        address.setWard(scanner.nextLine());

        System.out.println("District :");
        address.setDistrict(scanner.nextLine());

        System.out.println("Province :");
        address.setProvince(scanner.nextLine());

        for (int i = 0; i < studentList.length; i++) {
            Student student = new Student(id, name, age, classes,address);
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
                studentList[i].setAddress(null);
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

        Address address = new Address();

        System.out.println("Apartment Number :");
        address.setApartmentNumber(scanner.nextLine());

        System.out.println("Stress :");
        address.setStress(scanner.nextLine());

        System.out.println("Ward :");
        address.setWard(scanner.nextLine());

        System.out.println("District :");
        address.setDistrict(scanner.nextLine());

        System.out.println("Province :");
        address.setProvince(scanner.nextLine());


        for (int i = 0; i < studentList.length; i++) {
            if (newId == studentList[i].getId() && studentList[i] instanceof Student) {
                studentList[i].setId(newId);
                studentList[i].setName(newName);
                studentList[i].setAge(newAge);
                studentList[i].setClasses(newClass);
                studentList[i].setAddress(address);
                break;
            } else if (newId == studentList[i].getId()) {
                System.out.println("Same ID");
                break;
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