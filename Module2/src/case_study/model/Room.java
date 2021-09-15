package case_study.model;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room(int idSeveice, String service, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalStyle, String freeServiceIncluded) {
        super(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
