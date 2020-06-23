package hau.example.test_province.servince;

import hau.example.test_province.entities.Customer;

import java.util.List;

public interface CustomerServince {
    List<Customer> getAllCustomer();

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void deleteCustomer(Customer customer);
}
