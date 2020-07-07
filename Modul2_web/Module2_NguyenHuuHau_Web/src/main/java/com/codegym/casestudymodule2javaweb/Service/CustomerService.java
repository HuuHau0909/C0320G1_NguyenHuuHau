package com.codegym.casestudymodule2javaweb.Service;

import com.codegym.casestudymodule2javaweb.Entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> getAllCustomerIsDeleteIsFalse(Pageable pageable);


    Page<Customer> findAllByNameContaining(String nameCustomer, Pageable pageable);

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);


    void deleteCustomer(Customer customer);
}
