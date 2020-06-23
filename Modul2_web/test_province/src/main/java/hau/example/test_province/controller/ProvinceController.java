package hau.example.test_province.controller;

import hau.example.test_province.entities.Province;
import hau.example.test_province.servince.ProvinceServince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("province")
public class ProvinceController {
    @Autowired
    private ProvinceServince provinceServince;

    @GetMapping("")
    public ModelAndView showListProvince() {
        List<Province> provinceList = provinceServince.getAllProvince();
        return new ModelAndView("province/list", "provinceList", provinceList);
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateProvince() {
        ModelAndView modelAndView = new ModelAndView("province/create", "province", new Province());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProvince(@ModelAttribute Province province){
        provinceServince.saveProvince(province);
        ModelAndView modelAndView=new ModelAndView("province/create","message","Save successfully!");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }


}
