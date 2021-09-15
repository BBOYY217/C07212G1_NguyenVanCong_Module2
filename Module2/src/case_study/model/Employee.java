package case_study.model;

public class Employee extends Person {
    private int idStaff;
    private String academicLevel;
    private String staffPosition;
    private int salary;

    public Employee(int idCard, String name, int dayOfBirth, String gender, String phoneNumber, String email, int idStaff, String academicLevel, String staffPosition, int salary) {
        super(idCard, name, dayOfBirth, gender, phoneNumber, email);
        this.idStaff = idStaff;
        this.academicLevel = academicLevel;
        this.staffPosition = staffPosition;
        this.salary = salary;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idStaff=" + idStaff +
                ", academicLevel='" + academicLevel + '\'' +
                ", staffPosition='" + staffPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
