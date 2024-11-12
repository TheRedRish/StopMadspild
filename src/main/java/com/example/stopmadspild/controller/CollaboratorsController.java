package com.example.stopmadspild.controller;

import com.example.stopmadspild.model.Partner;
import com.example.stopmadspild.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CollaboratorsController {

    @Autowired
    PartnerService partnerService;

    @GetMapping("/collaborators")
    public String collaborators(Model model) {
        List<Partner> partners = partnerService.getAllPartners();
        model.addAttribute("partners", partners);
        return "collaborators";
    }
}
