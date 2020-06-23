package Controllers;

import java.util.Scanner;

import static Controllers.BookingController.addNewBooking;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInfomationCustomer;
import static Controllers.EmployeeController.showInfomationEmployee;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showService;

public class MainController {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

        System.out.println("MAIN MENU\n" +
                "1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information of Customer\n" +
                "5. Add New Booking\n" +
                "6. Show Information of Employee\n" +
                "7. Exit\n");
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                addNewServices();
                break;
            case "2":
                showService();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInfomationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInfomationEmployee();
                break;
            case "7":
                System.out.println("Exit");
                System.exit(1);
                break;
            default:
                System.out.println("Invalided! Please press enter to try again!");
                scanner.nextLine();
                displayMainMenu();
        }
    }}


