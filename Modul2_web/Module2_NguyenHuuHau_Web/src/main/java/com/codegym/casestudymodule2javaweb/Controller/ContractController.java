package com.codegym.casestudymodule2javaweb.Controller;

import com.codegym.casestudymodule2javaweb.Entity.Contract;

import com.codegym.casestudymodule2javaweb.Entity.Customer;
import com.codegym.casestudymodule2javaweb.Entity.Service;
import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import com.codegym.casestudymodule2javaweb.Service.ContractService;
import com.codegym.casestudymodule2javaweb.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private CustomerService customerService;

    @ModelAttribute("customers")
    public Iterable<Customer> getAllCustomer() {
        return customerService.getAllCustomerIsDeleteIsFalse(Pageable.unpaged());
    }

    @GetMapping("")
    public ModelAndView showContractList(@PageableDefault(value = 3) Pageable pageable,
                                         @RequestParam(name = "search") Optional<Date> search) {
        Page<Contract> contracts;
        pageable = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("startDayContract").descending());
        ModelAndView modelAndView = new ModelAndView("/contract/contractList");
        if (search.isPresent()) {
            contracts = contractService.findAllByStartDayContract(search.get(), pageable);
            modelAndView.addObject("search", search.get());
        } else {
            contracts = contractService.getAllContract(pageable);
        }
        modelAndView.addObject("contracts", contracts);
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public ModelAndView showFormCreateContract() {
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("contract", new Contract());
        return modelAndView;
    }

}
