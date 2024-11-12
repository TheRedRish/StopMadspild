package com.example.stopmadspild.controller;
import com.example.stopmadspild.model.Partner;
import com.example.stopmadspild.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PrivateUserController {

    @Autowired
    PartnerService partnerService;

    @GetMapping("/partner/{id}")
    public String partnerPage(Model model, @PathVariable int id){
        Partner partner = partnerService.getPartnerById(id).get();
        model.addAttribute("partner", partner);
        return "partner";
    }

    @GetMapping("/privateuser")
    public String privateUser(Model model){
        List<Partner> partners = partnerService.getAllPartners();
        model.addAttribute("partners", partners);
        return "privateuser";
    }
}
