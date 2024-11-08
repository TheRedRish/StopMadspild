package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class PrivatforbrugerController {

    @GetMapping("/privatforbrugere")
    public String index1(){
        return "privatforbruger";
    }

    @PostMapping("/privatforbruger")
    public String index(){
        return "redirect:privatforbruger";
    }

}
