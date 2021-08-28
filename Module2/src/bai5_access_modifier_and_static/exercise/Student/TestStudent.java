package bai5_access_modifier_and_static.exercise.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Cong");
        student.setClasses("C04");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
