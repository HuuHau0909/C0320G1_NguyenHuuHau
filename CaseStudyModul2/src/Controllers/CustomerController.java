package Controllers;

import Commons.FunctinWriteAndReadFileCSV;
import Commons.FunctionGeneric;
import Models.Customer;

import java.util.List;

import static Commons.FunctionGeneric.displaylist;
import static Controllers.MainController.displayMainMenu;

public class CustomerController {
    public static void addNewCustomer(){
        Customer customer = new Customer();
        customer.setFullName();
        customer.setBirthday();
        customer.setGender();
        customer.setID();
        customer.setphone();
        customer.setEmail();
        customer.setCustomerType();
        customer.setAddress();

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
