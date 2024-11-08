package com.example.stopmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VirksomhederController {

    @GetMapping("/virksomheder")
    public String index1(){
        return "virksomheder";
    }

    @PostMapping("/virksomheder")
    public String index(){
        return "redirect:virksomheder";
    }

}
