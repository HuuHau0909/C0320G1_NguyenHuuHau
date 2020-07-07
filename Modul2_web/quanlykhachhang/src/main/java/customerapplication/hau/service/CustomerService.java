package customerapplication.hau.service;

import customerapplication.hau.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

//    Customer findById(Long id);

    void save(Customer customer);

    Customer remove(Long id);
}
