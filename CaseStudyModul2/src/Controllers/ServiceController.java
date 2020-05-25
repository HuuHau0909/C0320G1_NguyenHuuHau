package Controllers;

import Commons.FunctinWriteAndReadFileCSV;
import Commons.FunctionGeneric;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;

import java.util.List;
import java.util.Scanner;

import static Commons.FunctionGeneric.displaylist;
import static Controllers.MainController.displayMainMenu;

public class ServiceController {
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
        displayMainMenu();
    }

    private static void addNewRoom() {
        Services room = new Room();
        room = addServices(room);
        System.out.println("Enter Free Services: ");
        ((Room) room).setFreeServices(scanner.nextLine());
        List<Room> roomList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.ROOM);
        roomList.add((Room) room);
        FunctinWriteAndReadFileCSV.writeRoomToFileCsv(roomList);
        System.out.println("Add Room: " + room.getServiceName() + " Successfully");
        displayMainMenu();
    }

    private static void addNewHouse() {
        Services house = new House();
        house = addServices(house);
        System.out.println("Enter House Standard: ");
        ((House) house).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Convenient Description: ");
        ((House) house).setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        ((House) house).setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        List<House> houseList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.HOUSE);
        houseList.add((House) house);
        FunctinWriteAndReadFileCSV.writeHouseToFileCsv(houseList);
        System.out.println("Add House: " + house.getServiceName() + " Successfully");
        displayMainMenu();
    }

    private static void addNewVilla() {
        Services villa = new Villa();
        villa = addServices(villa);
        System.out.println("Enter Room Standard: ");
        ((Villa) villa).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Swimming Pool Area: ");
        ((Villa) villa).setSwimmingPoolArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Convenient Description: ");
        ((Villa) villa).setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        ((Villa) villa).setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        List<Villa> villaList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.VILLA);
        villaList.add((Villa) villa);
        FunctinWriteAndReadFileCSV.writeVillaToFileCsv(villaList);
        System.out.println("Add Villa: " + villa.getServiceName() + " Successfully");
        displayMainMenu();

    }

    private static Services addServices(Services services) {
        System.out.println("Enter Service ID: ");
        services.setId(FuncValidation.getValidIdService(services,ENTER_SER));

        System.out.println("Enter Service Name: ");
        services.setServiceName(scanner.nextLine());
        System.out.println("Enter Area Use: ");
        services.setAreaUse(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Rental Cost: ");
        services.setRentalCosts(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Max Nunber Of People: ");
        services.setRentalCosts(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Rent Type: ");
        services.setRentType(scanner.nextLine());
        return services;
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

    private static void showAllNameRoomNotDuplicate() {
    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameVillaNotDuplicate() {
    }

    private static void showRoomService() {
        List<Room> roomList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.ROOM);
        displaylist(roomList);
        displayMainMenu();
    }

    private static void showHouseService() {
        List<House> houseList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.HOUSE);
        displaylist(houseList);
        displayMainMenu();
    }

    private static void showVillaService() {
        List<Villa> villaList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.VILLA);
        displaylist(villaList);
        displayMainMenu();
    }
}

