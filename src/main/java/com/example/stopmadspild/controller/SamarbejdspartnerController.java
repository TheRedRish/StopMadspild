package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SamarbejdspartnerController {

    @GetMapping("/samarbejdspartner")
    public String index1(){
        return "samarbejdspartnere";
    }

    @PostMapping("/samarbejdspartner")
    public String index(){
        return "redirect:samarbejdspartner";
    }

}
