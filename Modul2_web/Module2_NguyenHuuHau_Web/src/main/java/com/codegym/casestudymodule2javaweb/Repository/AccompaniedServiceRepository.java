package com.codegym.casestudymodule2javaweb.Repository;

import com.codegym.casestudymodule2javaweb.Entity.AccompaniedService;
import com.codegym.casestudymodule2javaweb.Entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccompaniedServiceRepository extends JpaRepository<AccompaniedService, Long> {
}
