package com.haulaptrinh.testboot.controllers;


import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.haulaptrinh.testboot.models.Student;
import com.haulaptrinh.testboot.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ModelAndView getHomeStudent() {
        return new ModelAndView("student/index", "students", studentService.getAllStudent());
    }

    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message","Delete Successful!!!");
        studentService.deleteStudent(id);
        return "redirect:/";
    }
    @GetMapping("/student/edit/{id}")
    public ModelAndView getEditPage(@PathVariable Integer id){
        return new ModelAndView("student/edit","student",studentService.findStudentById(id));
    }
    @PostMapping("/student/edit")
    public String editStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }
}
