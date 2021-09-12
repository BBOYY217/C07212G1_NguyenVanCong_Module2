package bai_lam_them_fix_bug_tuan4;

public class Employee extends Person {
    private int salary;

    public Employee(int salary, String name, int age, String address) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Employee by motorbike or car");
    }

}
