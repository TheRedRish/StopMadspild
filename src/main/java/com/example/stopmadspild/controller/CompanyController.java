package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

    @GetMapping("/company")
    public String index1(){
        return "company";
    }

    @PostMapping("/company")
    public String index(){
        return "redirect:company";
    }

}
