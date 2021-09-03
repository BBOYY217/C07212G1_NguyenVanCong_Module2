package case_study.model;

public class Employee extends Person {
    private int idStaff;
    private String academicLevel; // trình độ học tập
    private String staffPosition; // vị trí của nhân viên

    public Employee(String name, String dayOfBirth, String gender, String phoneNumber, String email, int idStaff, String academicLevel, String staffPosition) {
        super(name, dayOfBirth, gender, phoneNumber, email);
        this.idStaff = idStaff;
        this.academicLevel = academicLevel;
        this.staffPosition = staffPosition;
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

    @Override
    public String toString() {
        return "Employee{" +
                "idStaff=" + idStaff +
                ", academicLevel='" + academicLevel + '\'' +
                ", staffPosition='" + staffPosition + '\'' +
                '}';
    }
}
