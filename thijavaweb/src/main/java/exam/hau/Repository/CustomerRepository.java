package exam.hau.Repository;


import exam.hau.Entity.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    Page<Customer> findAllByIsDeleteIsFalse(Pageable pageable);
//
    Page<Customer> findAllByNameCustomerContaining(String nameCustomer, Pageable pageable);
    Customer findByIdCustomer(String string);
}
