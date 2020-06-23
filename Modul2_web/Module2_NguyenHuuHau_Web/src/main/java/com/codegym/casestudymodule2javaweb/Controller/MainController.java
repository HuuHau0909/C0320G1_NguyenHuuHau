package com.codegym.casestudymodule2javaweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String layout(){
        return "home";
    }
}
