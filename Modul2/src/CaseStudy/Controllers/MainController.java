package CaseStudy.Controllers;


import CaseStudy.Commons.FunctionWriteAndReadFileCSV;
import CaseStudy.Models.Villa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static CaseStudy.Controllers.BookingController.addNewBooking;
import static CaseStudy.Controllers.CustomerController.addNewCustomer;
import static CaseStudy.Controllers.CustomerController.showInfomationCustomer;
import static CaseStudy.Controllers.EmployeeController.showInfomationEmployee;
import static CaseStudy.Controllers.ServiceController.addNewServices;
import static CaseStudy.Controllers.ServiceController.showService;

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
                System.out.println("Invailed! Please press enter to try again!");
                scanner.nextLine();
                displayMainMenu();
        }
    }


}
