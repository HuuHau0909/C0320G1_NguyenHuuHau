package com.codegym.casestudymodule2javaweb.Repository;

import com.codegym.casestudymodule2javaweb.Entity.Employee;
import com.codegym.casestudymodule2javaweb.Entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
