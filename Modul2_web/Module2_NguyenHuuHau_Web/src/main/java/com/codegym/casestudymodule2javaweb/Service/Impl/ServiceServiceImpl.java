package com.codegym.casestudymodule2javaweb.Service.Impl;

import com.codegym.casestudymodule2javaweb.Repository.ServiceRepository;
import com.codegym.casestudymodule2javaweb.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    public Page<com.codegym.casestudymodule2javaweb.Entity.Service> getAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<com.codegym.casestudymodule2javaweb.Entity.Service> findAllByNameContaining(String nameService, Pageable pageable) {
        return serviceRepository.findAllByNameServiceContaining(nameService, pageable);
    }

    @Override
    public void saveService(com.codegym.casestudymodule2javaweb.Entity.Service service) {
        serviceRepository.save(service);
    }


}
