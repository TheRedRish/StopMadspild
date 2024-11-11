package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AboutDMM {

    @GetMapping("/aboutdmm")
    public String index1(){
        return "aboutdmm";
    }

    @PostMapping("/aboutdmm")
    public String index(){
        return "redirect:kontakt";
    }
}
