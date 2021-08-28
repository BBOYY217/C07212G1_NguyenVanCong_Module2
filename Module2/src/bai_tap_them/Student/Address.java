package bai_tap_them.Student;

public class Address {
    private String apartmentNumber;
    private String stress;
    private String ward;
    private String district;
    private String province;

    public Address() {
    }

    public Address(String apartmentNumber, String stress, String ward, String district,String province) {
        this.apartmentNumber = apartmentNumber;
        this.stress = stress;
        this.ward = ward;
        this.district = district;
        this.province =province;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "apartmentNumber='" + apartmentNumber + '\'' +
                ", stress='" + stress + '\'' +
                ", ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
