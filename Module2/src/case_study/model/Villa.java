package case_study.model;

public class Villa extends Facility{
    private String roomStandad ;
    private double poolArea;
    private int floor;

    public Villa(int idSeveice, String service, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalStyle, String roomStandad, double poolArea, int floor) {
        super(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle);
        this.roomStandad = roomStandad;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandad() {
        return roomStandad;
    }

    public void setRoomStandad(String roomStandad) {
        this.roomStandad = roomStandad;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandad='" + roomStandad + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
