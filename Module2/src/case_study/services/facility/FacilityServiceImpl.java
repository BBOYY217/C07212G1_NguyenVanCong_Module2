package case_study.services.facility;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + facilityIntegerEntry.getKey() + "number of times the tenant" + facilityIntegerEntry.getValue());
        }
    }

    @Override
    public void displayMaintenance() {

    }


    @Override
    public void addNewVilla() {
        System.out.println("Enter id service");
        int idSeveice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter service");
        String service = scanner.nextLine();

        System.out.println("Enter usable area ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental costs ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter maximum number of people");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental style ");
        String rentalStyle = scanner.nextLine();

        System.out.println("Enter room standad");
        String roomStandad = scanner.nextLine();

        System.out.println("Enter pool area");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter floor");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle, roomStandad, poolArea, floor);
        facilityIntegerMap.put(villa, 0);

        System.out.println("Add new villa success");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter id service");
        int idSeveice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter service");
        String service = scanner.nextLine();

        System.out.println("Enter usable area ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental costs ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter maximum number of people");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental style ");
        String rentalStyle = scanner.nextLine();

        System.out.println("Enter room standad");
        String roomStandad = scanner.nextLine();

        System.out.println("Enter floor");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle, roomStandad, floor);
        facilityIntegerMap.put(house, 0);

        System.out.println("Add new house success");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter id service");
        int idSeveice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter service");
        String service = scanner.nextLine();

        System.out.println("Enter usable area ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental costs ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter maximum number of people");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rental style ");
        String rentalStyle = scanner.nextLine();

        System.out.println("Enter free service included");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(idSeveice, service, usableArea, rentalCosts, maximumNumberOfPeople, rentalStyle, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
    }
}
