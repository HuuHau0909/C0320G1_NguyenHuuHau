package com.codegym.casestudymodule2javaweb.Service;

import com.codegym.casestudymodule2javaweb.Entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {

//    List<Service> getAllService();

    Page<Service> getAllService(Pageable pageable);

    Page<Service> findAllByNameContaining(String nameService, Pageable pageable);


    void saveService(Service service);
}
