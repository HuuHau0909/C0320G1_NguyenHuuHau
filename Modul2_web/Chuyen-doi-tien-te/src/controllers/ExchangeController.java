package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {
    @GetMapping("/index")
    public String show() {
        return "index";
    }
    @PostMapping("/index")
    public String exchange(@RequestParam ("rate") double rate, @RequestParam("usd") double usd, Model model){
        double vnd = rate*usd;
        model.addAttribute("vnd",vnd);
                return "exchange";
    }

}
