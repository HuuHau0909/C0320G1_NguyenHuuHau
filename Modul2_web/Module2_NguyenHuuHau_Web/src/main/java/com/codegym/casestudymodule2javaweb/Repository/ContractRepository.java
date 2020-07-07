package com.codegym.casestudymodule2javaweb.Repository;

import com.codegym.casestudymodule2javaweb.Entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    Page<Contract> findAllByStartDayContractIs(Date date, Pageable pageable);

}
