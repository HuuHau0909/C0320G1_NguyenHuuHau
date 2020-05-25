package CaseStudy.Controllers;

import CaseStudy.Commons.FunctionWriteAndReadFileCSV;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.displayMainMenu;

public class ServiceController {
    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    private static ArrayList<House> listHouse = new ArrayList<House>();
    private static ArrayList<Room> listRooms = new ArrayList<Room>();
    public static Scanner scanner = new Scanner(System.in);

    public static void addNewServices() {
        System.out.println("ADD NEW SERVICE MENU\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invailed! Please press enter to try again!");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void addNewVilla() {
        listVilla = FunctionWriteAndReadFileCSV.getVillaFromFileCSV();
        Villa villa = new Villa();
        System.out.println("Enter ID: ");
        villa.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        villa.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        villa.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Cost: ");
        villa.setCost(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Max people: ");
        villa.setMaxPeople(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Type Rent: ");
        villa.setTypeRent(scanner.nextLine());
        System.out.println("Enter Villa standard: ");
        villa.setvillaStandard(scanner.nextLine());
        System.out.println("Enter Swimming Pool Area: ");
        villa.setSwimmingPoolArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Convenient Description: ");
        villa.setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Number of Floors: ");
        villa.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        listVilla.add(villa);
        FunctionWriteAndReadFileCSV.writeVillaToFile(listVilla);
        System.out.println("Villa added! Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewHouse() {
        listHouse = FunctionWriteAndReadFileCSV.getHouseFromFileCSV();
        House house = new House();
        System.out.println("Enter ID: ");
        house.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        house.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        house.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Cost: ");
        house.setCost(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Max people: ");
        house.setMaxPeople(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Type Rent: ");
        house.setTypeRent(scanner.nextLine());
        System.out.println("Enter house standard: ");
        house.sethouseStandard(scanner.nextLine());
        System.out.println("Enter Convenient Description: ");
        house.setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Number of Floors: ");
        house.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        listHouse.add(house);
        FunctionWriteAndReadFileCSV.writeHouseToFile(listHouse);
        System.out.println("House added! Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewRoom() {
        listRooms = FunctionWriteAndReadFileCSV.getRoomFromFileCSV();
        Room room = new Room();
        System.out.println("Enter ID: ");
        room.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        room.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        room.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Cost: ");
        room.setCost(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Max people: ");
        room.setMaxPeople(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Type Rent: ");
        room.setTypeRent(scanner.nextLine());
        System.out.println("Enter free services: ");
        room.setFreeServices(scanner.nextLine());
        listRooms.add(room);
        FunctionWriteAndReadFileCSV.writeRoomToFile(listRooms);
        System.out.println("Room added! Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void showService() {
        System.out.println("SHOW SERVICE MENU\n" +
                "1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Name Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");

        String choose = scanner.nextLine();
        switch (choose) {
            case "1": {
                showVillaService();
                break;
            }
            case "2": {
                System.out.println("case 2");
                showHouseService();
                break;
            }
            case "3": {
                showRoomService();
                break;
            }
            case "4": {
                showAllNameVillaNotDuplicate();
                break;
            }
            case "5": {
                showAllNameHouseNotDuplicate();
                break;
            }
            case "6": {
                showAllNameRoomNotDuplicate();
                break;
            }

            case "7": {
                displayMainMenu();
                break;
            }

            case "8": {
                System.exit(0);
            }

            default:
                System.out.println("Invailed! Please press enter to try again!");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void showVillaService() {
        listVilla = FunctionWriteAndReadFileCSV.getVillaFromFileCSV();
        for (Villa villa : listVilla) {
            System.out.println("----------------------------------------------------");
            System.out.println("ID: " + villa.getId());
            System.out.println("Service Name: " + villa.getServiceName());
            System.out.println("Area: " + villa.getArea());
            System.out.println("Cost: " + villa.getCost());
            System.out.println("Max people: " + villa.getMaxPeople());
            System.out.println("Type Rent: " + villa.getTypeRent());
            System.out.println("Villa standard: " + villa.getvillaStandard());
            System.out.println("Swimming Pool Area: " + villa.getSwimmingPoolArea());
            System.out.println("Convenient Description: " + villa.getConvenientDescription());
            System.out.println("Number of Floors: " + villa.getNumberOfFloors());
            System.out.println("----------------------------------------------------");
        }
        System.out.println("Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void showHouseService() {
        listHouse = FunctionWriteAndReadFileCSV.getHouseFromFileCSV();
        for (House house : listHouse) {
            System.out.println("----------------------------------------------------");
            System.out.println("ID: " + house.getId());
            System.out.println("Service Name: " + house.getServiceName());
            System.out.println("Area: " + house.getArea());
            System.out.println("Cost: " + house.getCost());
            System.out.println("Max people: " + house.getMaxPeople());
            System.out.println("Type Rent: " + house.getTypeRent());
            System.out.println("Villa standard: " + house.gethouseStandard());
            System.out.println("Convenient Description: " + house.getConvenientDescription());
            System.out.println("Number of Floors: " + house.getNumberOfFloors());
            System.out.println("----------------------------------------------------");
        }
        System.out.println("Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void showRoomService() {
        listRooms = FunctionWriteAndReadFileCSV.getRoomFromFileCSV();
        for (Room room : listRooms) {
            System.out.println("----------------------------------------------------");
            System.out.println("ID: " + room.getId());
            System.out.println("Service Name: " + room.getServiceName());
            System.out.println("Area: " + room.getArea());
            System.out.println("Cost: " + room.getCost());
            System.out.println("Max people: " + room.getMaxPeople());
            System.out.println("Type rent: " + room.getTypeRent());
            System.out.println("Free services: " + room.getFreeServices());
            System.out.println("----------------------------------------------------");

        }
        System.out.println("Please press enter to continute!");
        scanner.nextLine();
        displayMainMenu();
    }


    private static void showAllNameVillaNotDuplicate() {
    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameRoomNotDuplicate() {
    }
}
