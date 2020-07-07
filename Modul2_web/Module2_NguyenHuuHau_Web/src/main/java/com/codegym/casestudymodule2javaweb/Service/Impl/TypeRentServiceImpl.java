package com.codegym.casestudymodule2javaweb.Service.Impl;

import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import com.codegym.casestudymodule2javaweb.Repository.TypeRentRepository;
import com.codegym.casestudymodule2javaweb.Service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeRentServiceImpl implements TypeRentService {
    @Autowired
    private TypeRentRepository typeRentRepository;

    @Override
    public Iterable<TypeRent> findAll() {
        return typeRentRepository.findAll();
    }

    @Override
    public TypeRent findTypeRentById(Long id) {
        return typeRentRepository.findById(id).orElse(null);
    }


}

