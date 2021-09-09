package bai17_binary_and_serialization.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void writeToFile(String path, List<Student> student)  {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("src\\bai17_binary_and_serialization\\practice\\student", students);
        List<Student> studentDataFromFile = readDataFromFile("src\\bai17_binary_and_serialization\\practice\\student");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
