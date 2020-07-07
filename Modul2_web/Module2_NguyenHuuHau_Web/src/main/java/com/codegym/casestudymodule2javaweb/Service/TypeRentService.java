package com.codegym.casestudymodule2javaweb.Service;

import com.codegym.casestudymodule2javaweb.Entity.TypeRent;

public interface TypeRentService {
    Iterable<TypeRent> findAll();

    TypeRent findTypeRentById(Long id);
}
