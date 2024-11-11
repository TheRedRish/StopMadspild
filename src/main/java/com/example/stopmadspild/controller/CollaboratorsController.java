package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollaboratorsController {

    @GetMapping("/collaborators")
    public String index1(){
        return "collaborators";
    }

    @PostMapping("/collaborators")
    public String index(){
        return "redirect:collaborators";
    }

}
