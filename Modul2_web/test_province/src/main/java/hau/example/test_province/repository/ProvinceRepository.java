package hau.example.test_province.repository;

import hau.example.test_province.entities.Customer;
import hau.example.test_province.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
    List<Province> findAllByIsDeleteIsFalse();
}
