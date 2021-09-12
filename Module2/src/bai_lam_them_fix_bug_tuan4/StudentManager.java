package bai_lam_them_fix_bug_tuan4;

import bai_lam_them_fix_bug_tuan4.util.ReadAndWrite;

import java.util.*;

public class StudentManager {
    static final String PATH = "src\\bai_lam_them_fix_bug_tuan4\\student.csv";
    static List<Student> studentList = new ArrayList<>();

    // thêm mới student
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter address");
        String address = scanner.nextLine();

        Student student = new Student(name, age, address);
        studentList.add(student);
        ReadAndWrite.writeListStudentToCSV(PATH, studentList, true);
    }

    // hiện thị danh sách
    public static void display() {
        studentList = ReadAndWrite.getListStudent(PATH);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }
}
