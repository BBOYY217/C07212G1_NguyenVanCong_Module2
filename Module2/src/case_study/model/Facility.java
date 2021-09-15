package case_study.model;

public class Facility {
    private int idSeveice;
    private String service;
    private int usableArea;
    private int rentalCosts;
    private int maximumNumberOfPeople;
    private String rentalStyle;

    public Facility() {
    }

    public Facility(int idSeveice, String service, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalStyle) {
        this.idSeveice = idSeveice;
        this.service = service;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalStyle = rentalStyle;
    }

    public int getIdSeveice() {
        return idSeveice;
    }

    public void setIdSeveice(int idSeveice) {
        this.idSeveice = idSeveice;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalStyle() {
        return rentalStyle;
    }

    public void setRentalStyle(String rentalStyle) {
        this.rentalStyle = rentalStyle;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idSeveice=" + idSeveice +
                ", service='" + service + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalStyle='" + rentalStyle + '\'' +
                '}';
    }
}
