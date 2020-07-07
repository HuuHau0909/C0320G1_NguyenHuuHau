package com.codegym.casestudymodule2javaweb.Controller;

import com.codegym.casestudymodule2javaweb.Entity.Customer;
import com.codegym.casestudymodule2javaweb.Entity.Service;
import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import com.codegym.casestudymodule2javaweb.Service.ServiceService;
import com.codegym.casestudymodule2javaweb.Service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;
    @Autowired
    TypeRentService typeRentService;

    @ModelAttribute("typeRents")
    public Iterable<TypeRent> getTypeRents() {
        return typeRentService.findAll();
    }

    @GetMapping("")
    public String chooseService() {
        return "service/chooseService";
    }

    @GetMapping(value = "/createVilla")
    public ModelAndView showFormCreateService() {
        ModelAndView modelAndView = new ModelAndView("service/createVilla");
        modelAndView.addObject("service", new Service());
        return modelAndView;
    }

    @GetMapping(value = "/createRoom")
    public ModelAndView showFormCreateService1() {
        ModelAndView modelAndView = new ModelAndView("service/createRoom");
        modelAndView.addObject("service", new Service());
        return modelAndView;
    }

    @GetMapping(value = "/createHouse")
    public ModelAndView showFormCreateService2() {
        ModelAndView modelAndView = new ModelAndView("service/createHouse");
        modelAndView.addObject("service", new Service());
        return modelAndView;
    }


    @PostMapping("/create")
    public ModelAndView createNewService(@Valid @ModelAttribute(name = "service") Service service,
                                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("service/create");
        } else {
            serviceService.saveService(service);
            ModelAndView modelAndView = new ModelAndView("service/create");
            modelAndView.addObject("service", new Service());
            modelAndView.addObject("message", "New service created successfully");
            return modelAndView;
        }
    }

    @GetMapping("/serviceList")
    public ModelAndView showServiceList(Pageable pageable,
                                        @RequestParam(name = "search") Optional<String> search) {
        Page<Service> services;
        pageable = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("nameService").descending());
        ModelAndView modelAndView = new ModelAndView("/service/serviceList");
        if (search.isPresent()) {
            services = serviceService.findAllByNameContaining(search.get(), pageable);
            modelAndView.addObject("search", search.get());
        } else {
            services = serviceService.getAllService(pageable);
        }
        modelAndView.addObject("services", services);
        return modelAndView;
    }
}
