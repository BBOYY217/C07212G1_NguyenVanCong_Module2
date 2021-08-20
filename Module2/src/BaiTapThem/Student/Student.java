package BaiTapThem.Student;

public class Student {
    private int  id ;
    private String name;
    private int age;
    private String classes ;

    public Student() {
    }

    public Student(int id, String name, int age, String classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                '}';
    }
}

