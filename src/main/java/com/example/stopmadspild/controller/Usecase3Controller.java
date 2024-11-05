package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class Usecase3Controller {

@GetMapping("/")
public String index(){
    return "Usecase3";
}
}
