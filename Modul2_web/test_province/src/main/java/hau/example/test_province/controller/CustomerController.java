package hau.example.test_province.controller;

import hau.example.test_province.entities.Customer;
import hau.example.test_province.servince.CustomerServince;
import hau.example.test_province.servince.ProvinceServince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerServince customerServince;

    @Autowired
    private ProvinceServince provinceServince;

    @GetMapping("")
    public ModelAndView showListCustomer() {
        List<Customer> customers = customerServince.getAllCustomer();
        return new ModelAndView("customer/list", "customers", customers);
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create", "customer", new Customer());
        modelAndView.addObject("provinces", provinceServince.getAllProvince());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createNewCustomer(@Valid @ModelAttribute Customer customer,
                                    BindingResult bindingResult,
                                    RedirectAttributes redirectAttributes
                                   ) {
        if (bindingResult.hasErrors()) {
            return "customer/create";
        }
        if (customer == null) {
            return "404";
        }
        try {
            customerServince.saveCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message", "Create customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable Long id) {
        return new ModelAndView("customer/delete", "customer", customerServince.getCustomerById(id));
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute Customer customer, RedirectAttributes redirect) {
        try {
            customerServince.deleteCustomer(customer);
        } catch (Exception e) {
            return "500";
        }
        redirect.addFlashAttribute("message", "Delete successfully!");
        return "redirect:/customer";
    }
}

