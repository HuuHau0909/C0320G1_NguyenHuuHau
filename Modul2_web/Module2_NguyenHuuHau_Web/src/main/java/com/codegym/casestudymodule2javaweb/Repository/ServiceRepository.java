package com.codegym.casestudymodule2javaweb.Repository;

import com.codegym.casestudymodule2javaweb.Entity.Customer;
import com.codegym.casestudymodule2javaweb.Entity.Service;
import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

    Page<Service> findAllByNameServiceContaining(String nameService, Pageable pageable);
}
