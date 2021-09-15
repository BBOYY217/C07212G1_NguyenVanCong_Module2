package case_study.model;

public class Person {
    private int idCard;
    private String name;
    private int dayOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int idCard, String name, int dayOfBirth, String gender, String phoneNumber, String email) {
        this.idCard = idCard;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard=" + idCard +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
