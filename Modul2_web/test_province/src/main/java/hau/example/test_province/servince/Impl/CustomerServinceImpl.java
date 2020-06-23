package hau.example.test_province.servince.Impl;

import hau.example.test_province.entities.Customer;
import hau.example.test_province.repository.CustomerRepository;
import hau.example.test_province.servince.CustomerServince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServinceImpl implements CustomerServince {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findByIsDeleteIsFalseAndIdIs(id);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customer.setDelete(true);
        customerRepository.save(customer);
    }
}
