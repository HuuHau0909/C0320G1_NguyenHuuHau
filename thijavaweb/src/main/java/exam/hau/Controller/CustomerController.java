package exam.hau.Controller;


import exam.hau.Entity.Customer;
import exam.hau.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ModelAndView showCustomerList(@PageableDefault(value = 3) Pageable pageable,
                                         @RequestParam(name = "search") Optional<String> search) {
        Page<Customer> customers;
        pageable = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("nameCustomer").descending());
        ModelAndView modelAndView = new ModelAndView("/customer/customerList");
        if (search.isPresent()) {
            customers = customerService.findAllByNameContaining(search.get(), pageable);
            modelAndView.addObject("search", search.get());
        } else {
            customers = customerService.getAllCustomer(pageable);
        }
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createNewCustomer( @ModelAttribute(name = "customer") Customer customer,
                                          BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("customer/create");
        } else {
            customerService.saveCustomer(customer);
            ModelAndView modelAndView = new ModelAndView("customer/create");
            modelAndView.addObject("customer", new Customer());
            modelAndView.addObject("message", "New customer created successfully");
            return modelAndView;
        }
    }

    @GetMapping("/delete/{idCustomer}")
    public ModelAndView showDeleteCustomerForm(@PathVariable("idCustomer") String idCustomer) {
        return new ModelAndView("customer/delete", "customer", customerService.getCustomerById(idCustomer));
    }

    @PostMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") String id, RedirectAttributes redirect) {
        customerService.deleteCustomer(customerService.getCustomerById(id));
        redirect.addFlashAttribute("message", "Delete successfully");
        return "redirect:/customer";
    }
//    @GetMapping("/edit/{id}")
//    public ModelAndView showEditForm(@PathVariable("id") String id) {
//        Customer customer = customerService.getCustomerById(id);
//        if (customer != null) {
//            return new ModelAndView("customer/edit", "customer", customer);
//        } else return new ModelAndView("/error.404");
//    }
}

