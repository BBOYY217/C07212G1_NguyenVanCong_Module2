package case_study.model;

public class Booking implements Comparable<Booking> {
    private int idBooking;
    private int starDay;
    private int endDay;
    private String customerCode;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(int idBooking, int starDay, int endDay, String customerCode, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.starDay = starDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getStarDay() {
        return starDay;
    }

    public void setStarDay(int starDay) {
        this.starDay = starDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", starDay=" + starDay +
                ", endDay=" + endDay +
                ", customerCode='" + customerCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (o.getStarDay() > this.getStarDay()) {
            return 1;
        } else if (o.getStarDay() < this.getStarDay()) {
            return -1;
        } else {
            return 0;
        }
    }


}
