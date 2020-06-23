package Controllers;

import Commons.FuncValidation;
import Commons.FunctinWriteAndReadFileCSV;
import Commons.FunctionGeneric;
import Models.Customer;

import java.util.List;

import static Commons.FunctionGeneric.displaylist;
import static Controllers.MainController.displayMainMenu;
import static Controllers.MainController.scanner;

public class CustomerController {

    public static final String ENTER_CUSTOMER_NAME = "Enter customer name: ";
    public static final String INVALID_CUSTOMER_NAME = "Invalided input! Customer name begin with capitalized character!";
    public static final String ENTER_CUSTOMER_EMAIL = "Enter email: ";
    public static final String INVALID_CUSTOMER_EMAIL = "Invalided input! must be format abc@abc.abc";
    public static final String ENTER_CUSTOMER_GENDER = "Enter customer gender: ";
    public static final String INVALID_CUSTOMER_GENDER = "Invalided input! Customer name must be male or female or unknown!";
    public static final String ENTER_CUSTOMER_ID = "Enter customer ID: ";
    public static final String INVALID_CUSTOMER_ID = "Invalided input! ID has 9 digits and has format XXX XXX XXX";
    public static final String ENTER_CUSTOMER_BIRTHDAY = "Enter customer birthday: ";
    public static final String INVALID_CUSTOMER_BIRTHDAY = "Invalided input! Birthday must be format dd/mm/yyy!";

    public static void addNewCustomer(){
        Customer customer = new Customer();
        customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME,INVALID_CUSTOMER_NAME));
        customer.setBirthday(FuncValidation.getValidBirthday(ENTER_CUSTOMER_BIRTHDAY,INVALID_CUSTOMER_NAME));
        String gender = FuncValidation.getValidGender(ENTER_CUSTOMER_GENDER,INVALID_CUSTOMER_GENDER);
        customer.setGender(Character.toUpperCase(gender.charAt(0))+gender.substring(1,gender.length()).toLowerCase());
        customer.setID(FuncValidation.getValidID(ENTER_CUSTOMER_ID,INVALID_CUSTOMER_ID));
        System.out.println("Enter customer phone number: ");
        customer.setphone(scanner.nextLine());
        customer.setEmail(FuncValidation.getValidEmail(ENTER_CUSTOMER_EMAIL,INVALID_CUSTOMER_EMAIL));
        System.out.println("Enter customer type: ");
        customer.setCustomerType(scanner.nextLine());
        System.out.println("Enter customer address: ");
        customer.setAddress(scanner.nextLine());

        List<Customer> customersLists = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.CUSTOMER);
        customersLists.add(customer);
        FunctinWriteAndReadFileCSV.writeCustomerToFileCsv(customersLists);
        System.out.println("Add Customer: " + customer.getFullName()+" successfully!!!");
        displayMainMenu();
    }

    public static void showInfomationCustomer(){
List<Customer> customerList = FunctionGeneric.getListFromCSV(FunctionGeneric.EntityType.CUSTOMER);
customerList.sort(new SortNameAndYear());
displaylist(customerList);
displayMainMenu();
    }
}
