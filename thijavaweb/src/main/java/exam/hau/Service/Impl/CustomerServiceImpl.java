package exam.hau.Service.Impl;


import exam.hau.Entity.Customer;
import exam.hau.Repository.CustomerRepository;
import exam.hau.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
//    @Override
//    public List<Customer> getAllCustomer() {
//        return customerRepository.findAllByIsDeleteIsFalse();
//    }

//    @Override
//    public Page<Customer> getAllCustomerIsDeleteIsFalse(Pageable pageable) {
//        return customerRepository.findAllByIsDeleteIsFalse(pageable);
//    }
//
    @Override
    public Page<Customer> findAllByNameContaining(String nameCustomer, Pageable pageable) {
        return customerRepository.findAllByNameCustomerContaining(nameCustomer, pageable);
    }

    @Override
    public Page<Customer> getAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
//
    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
//
    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findByIdCustomer(id);
    }

    @Override
    public void deleteCustomer(Customer customer) {

        customerRepository.delete(customer);
    }


}


