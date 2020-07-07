package com.codegym.casestudymodule2javaweb.Controller;

import com.codegym.casestudymodule2javaweb.Entity.Service;
import com.codegym.casestudymodule2javaweb.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HomeController {

    @GetMapping("")
    public ModelAndView showHomePage() {
        return new ModelAndView("home");
    }


}
