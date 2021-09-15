package case_study.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int idCard, String name, int dayOfBirth, String gender, String phoneNumber, String email, String customerType, String address) {
        super(idCard, name, dayOfBirth, gender, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
