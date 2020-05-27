package Controllers;

import Commons.FuncValidation;
import Commons.FunctinWriteAndReadFileCSV;
import Commons.FunctionGeneric;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;
import java.util.Scanner;

import static Commons.FunctionGeneric.displaylist;
import static Controllers.MainController.displayMainMenu;

public class ServiceController {
    public static Scanner scanner = new Scanner(System.in);
    public static final String ENTER_SERVICE_ID = "Emter service Id: ";
    public static final String INVALID_SERVICE_ID = "Invalided input!. Service ID format SVXX-YYYY: ";
    public static final String ENTER_SERVICE_NAME = "Emter service name: ";
    public static final String INVALID_SERVICE_NAME = "Invalided input! Service name begin with Upper character!";
    public static final String ENTER_AREA_USE = "Emter area use: ";
    public static final String INVALID_AREA_USE = "Invalided input! Area must be more than 30m2";
    public static final String ENTER_RENTAL_COST = "Emter rental cost: ";
    public static final String INVALID_RENTAL_COST = "Invalided input! Rental cost must be more than 0";
    public static final String ENTER_MAX_NUMBER_PEOPLE = "Emter max number of people: ";
    public static final String INVALID_MAX_NUMBER_PEOPLE = "Invalided input! 0 < Number of people < 20";
    public static final String ENTER_RENT_TYPE = "Emter rent type: ";
    public static final String INVALID_RENT_TYPE = "Invalided input!Rent type begin with Upper character";
    public static final String ENTER_ROOM_STANDAR = "Emter room standar: ";
    public static final String INVALID_ROOM_STANDAR = "Invalided input! Room standar begin with Upper character";
    public static final String ENTER_AREA_POOL = "Emter swimming pool area: ";
    public static final String INVALID_AREA_POOL = "Invalided input!  Area > 30m2";
    public static final String ENTER_NUMBER_FLOOR = "Emter number of floors: ";
    public static final String INVALID_NUMBER_FLOOR = "Invalided input! Number of floors >0";
    public static final String ENTER_FREE_SERVICE = "Emter free service: ";
    public static final String INVALID_FREE_SERVICE = "Invalided input! Just inclue massage, karaoke, food, drink, car";

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
//        System.out.println("Enter Free Services: ");
        ((Room) room).setFreeServices(FuncValidation.getValidFreeServices(ENTER_FREE_SERVICE,INVALID_FREE_SERVICE));
        List<Room> roomList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.ROOM);
        roomList.add((Room) room);
        FunctinWriteAndReadFileCSV.writeRoomToFileCsv(roomList);
        System.out.println("Add Room: " + room.getServiceName() + " Successfully");
        displayMainMenu();
    }

    private static void addNewHouse() {
        Services house = new House();
        house = addServices(house);
//        System.out.println("Enter House Standard: ");
        ((House) house).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDAR,INVALID_ROOM_STANDAR));
        System.out.println("Enter Convenient Description: ");
        ((House) house).setConvenientDescription(scanner.nextLine());
//        System.out.println("Enter Number Of Floors: ");
        ((House) house).setNumberOfFloors(FuncValidation.getValidNumberInteger(ENTER_NUMBER_FLOOR,INVALID_NUMBER_FLOOR,0));
        List<House> houseList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.HOUSE);
        houseList.add((House) house);
        FunctinWriteAndReadFileCSV.writeHouseToFileCsv(houseList);
        System.out.println("Add House: " + house.getServiceName() + " Successfully");
        displayMainMenu();
    }

    private static void addNewVilla() {
        Services villa = new Villa();
        villa = addServices(villa);
//        System.out.println("Enter Room Standard: ");
        ((Villa) villa).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDAR,INVALID_ROOM_STANDAR));
//        System.out.println("Enter Swimming Pool Area: ");
        ((Villa) villa).setSwimmingPoolArea(FuncValidation.getValidNumberDouble(ENTER_AREA_POOL,INVALID_AREA_POOL,30.0));
        System.out.println("Enter Convenient Description: ");
        ((Villa) villa).setConvenientDescription(scanner.nextLine());
//        System.out.println("Enter Number Of Floors: ");
        ((Villa) villa).setNumberOfFloors(FuncValidation.getValidNumberInteger(ENTER_NUMBER_FLOOR,INVALID_NUMBER_FLOOR,0));
        List<Villa> villaList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.VILLA);
        villaList.add((Villa) villa);
        FunctinWriteAndReadFileCSV.writeVillaToFileCsv(villaList);
        System.out.println("Add Villa: " + villa.getServiceName() + " Successfully");
        displayMainMenu();
    }

    private static Services addServices(Services services) {
//        System.out.println("Enter Service ID: ");
        services.setId(FuncValidation.getValidIdService(services,ENTER_SERVICE_ID,INVALID_SERVICE_ID));
//        System.out.println("Enter Service Name: ");
        services.setServiceName(FuncValidation.getValidName(ENTER_SERVICE_NAME,INVALID_SERVICE_NAME));
//        System.out.println("Enter Area Use: ");
        services.setAreaUse(FuncValidation.getValidNumberDouble(ENTER_AREA_USE,INVALID_AREA_USE,30.0));
//        System.out.println("Enter Rental Cost: ");
        services.setRentalCosts(FuncValidation.getValidNumberDouble(ENTER_RENTAL_COST,INVALID_RENTAL_COST,0.0));
//        System.out.println("Enter Max Nunber Of People: ");
        services.setMaxNumberOfPeople(FuncValidation.getValidNumberInteger(ENTER_MAX_NUMBER_PEOPLE,INVALID_MAX_NUMBER_PEOPLE,0,20));
//        System.out.println("Enter Rent Type: ");
        services.setRentType(FuncValidation.getValidName(ENTER_RENT_TYPE,INVALID_RENT_TYPE));
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

