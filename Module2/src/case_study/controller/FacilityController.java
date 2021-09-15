package case_study.controller;

import case_study.services.facility.FacilityService;
import case_study.services.facility.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacilityMenu(){
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService =new FacilityServiceImpl();
        int choise =Integer.parseInt(scanner.nextLine());
        while(true){
            System.out.println("1.Display list facility\n");
            System.out.println("2.Add new facility\n");
            System.out.println("3.Display list facility maintenance\n");
            System.out.println("4.Return main menu\n");
            switch (choise){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("choose again");
            }
        }
    }
    public static void addNewFacility(){
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService =new FacilityServiceImpl();
        int choise =Integer.parseInt(scanner.nextLine());
        while(true) {
            System.out.println("1.Add new villa\n");
            System.out.println("2.Add new house\n");
            System.out.println("3.Add new room\n");
            System.out.println("4.eturn main menu\n");
            switch (choise) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("choose again");
            }
        }
    }
}
