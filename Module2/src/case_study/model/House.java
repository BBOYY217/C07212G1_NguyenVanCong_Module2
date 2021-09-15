package case_study.model;

public class House extends Facility{
    private String roomStandad;
    private int floor;

    public House(int idSeveice, String service, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalStyle, String roomStandad, int floor) {
        super(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle);
        this.roomStandad = roomStandad;
        this.floor = floor;
    }

    public String getRoomStandad() {
        return roomStandad;
    }

    public void setRoomStandad(String roomStandad) {
        this.roomStandad = roomStandad;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandad='" + roomStandad + '\'' +
                ", floor=" + floor +
                '}';
    }
}
