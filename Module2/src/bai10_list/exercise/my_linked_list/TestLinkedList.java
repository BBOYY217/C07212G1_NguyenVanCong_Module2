package bai10_list.exercise.my_linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");
        Student student3 = new Student(3,"C");
        Student student4 = new Student(4,"D");
        Student student5 = new Student(5,"F");

        myLinkedList.addFirs(student1);
        myLinkedList.addFirs(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);


        System.out.println(myLinkedList.indexOf(student3));
    }
}
