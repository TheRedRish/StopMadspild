package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OmDmm {

    @GetMapping("/omdmm")
    public String index1(){
        return "omdmm";
    }

    @PostMapping("/kontakt")
    public String index(){
        return "redirect:kontakt";
    }
}
