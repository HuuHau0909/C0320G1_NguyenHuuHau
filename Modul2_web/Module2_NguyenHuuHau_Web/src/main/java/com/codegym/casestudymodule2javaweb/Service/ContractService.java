package com.codegym.casestudymodule2javaweb.Service;

import com.codegym.casestudymodule2javaweb.Entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

public interface ContractService {
    Page<Contract> findAllByStartDayContract(Date date, Pageable pageable);

    Page<Contract> getAllContract(Pageable pageable);
}
