package exam.hau.Service;


import exam.hau.Entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

//    Page<Customer> getAllCustomerIsDeleteIsFalse(Pageable pageable);
//
//
    Page<Customer> findAllByNameContaining(String nameCustomer, Pageable pageable);

    Page<Customer> getAllCustomer(Pageable pageable);



    void saveCustomer(Customer customer);



    Customer getCustomerById(String id);
//
//
    void deleteCustomer(Customer customer);
}
