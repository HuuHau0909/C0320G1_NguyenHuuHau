package customerapplication.hau.service.impl;


import customerapplication.hau.model.Customer;
import customerapplication.hau.repository.CustomerRepository;
import customerapplication.hau.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public class CustomerServiecImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer remove(Long id) {
        return customerRepository.re;
    }
//
//    @Override
//    public void remove(Long id) {
//        customerRepository.deleteById(id);
//    }
}