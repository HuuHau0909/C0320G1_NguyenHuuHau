package com.codegym.casestudymodule2javaweb.Service.Impl;

import com.codegym.casestudymodule2javaweb.Entity.Customer;
import com.codegym.casestudymodule2javaweb.Repository.CustomerRepository;
import com.codegym.casestudymodule2javaweb.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
//    @Override
//    public List<Customer> getAllCustomer() {
//        return customerRepository.findAllByIsDeleteIsFalse();
//    }

    @Override
    public Page<Customer> getAllCustomerIsDeleteIsFalse(Pageable pageable) {
        return customerRepository.findAllByIsDeleteIsFalse(pageable);
    }

    @Override
    public Page<Customer> findAllByNameContaining(String nameCustomer, Pageable pageable) {
        return customerRepository.findAllByNameCustomerContaining(nameCustomer, pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customer.setDelete(true);
        customerRepository.save(customer);
    }


}


