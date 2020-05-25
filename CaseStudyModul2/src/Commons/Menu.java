package Commons;

import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {

        System.out.println("MAIN MENU\n" +
                "1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information of Customer\n" +
                "5. Add New Booking\n" +
                "6. Show Information of Employee\n" +
                "7. Exit\n");
        System.out.println("Select your choose!");
  }
//    public static void addNewServices() {
//        System.out.println("ADD NEW SERVICE MENU\n" +
//                "1.\tAdd New Villa\n" +
//                "2.\tAdd New House\n" +
//                "3.\tAdd New Room\n" +
//                "4.\tBack to menu\n" +
//                "5.\tExit\n");
//        String choose = scanner.nextLine();
//
//        switch (choose) {
//            case "1":
//                addNewVilla();
//                break;
//            case "2":
//                addNewHouse();
//                break;
//            case "3":
//                addNewRoom();
//                break;
//            case "4":
//                displayMainMenu();
//                break;
//            case "5":
//                System.out.println("Exit");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Invailed! Please press enter to try again!");
//                scanner.nextLine();
//                displayMainMenu();
//        }
//    }
}
