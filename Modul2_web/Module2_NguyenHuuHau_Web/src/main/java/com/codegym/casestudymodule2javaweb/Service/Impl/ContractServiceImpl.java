package com.codegym.casestudymodule2javaweb.Service.Impl;

import com.codegym.casestudymodule2javaweb.Entity.Contract;
import com.codegym.casestudymodule2javaweb.Repository.ContractRepository;
import com.codegym.casestudymodule2javaweb.Service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> findAllByStartDayContract(Date date, Pageable pageable) {
        return contractRepository.findAllByStartDayContractIs(date, pageable);
    }

    @Override
    public Page<Contract> getAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }
}
