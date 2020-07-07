package com.codegym.casestudymodule2javaweb.Repository;

import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRentRepository extends JpaRepository<TypeRent, Long> {

}
