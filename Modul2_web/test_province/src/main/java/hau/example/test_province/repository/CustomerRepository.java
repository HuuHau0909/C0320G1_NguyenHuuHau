package hau.example.test_province.repository;

import hau.example.test_province.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

List<Customer> findAllByIsDeleteIsFalse();

Customer findByIsDeleteIsFalseAndIdIs(Long id);
}
