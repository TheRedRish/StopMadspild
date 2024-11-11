package com.example.stopmadspild.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class PrivateUserController {

    @GetMapping("/privateuser")
    public String index1(){
        return "privateuser";
    }

    @PostMapping("/privateuser")
    public String index(){
        return "redirect:privateuser";
    }
}
