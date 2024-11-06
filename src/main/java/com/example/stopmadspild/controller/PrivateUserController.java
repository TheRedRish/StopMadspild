package com.example.stopmadspild.controller;

import com.example.stopmadspild.model.Partner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PrivateUserController {

    @GetMapping("/private")
    public String privatePage(Model model) {

        // TODO Replace with fetch of partners
        ArrayList<Partner> partners = new ArrayList<>();
        Partner partner = new Partner();
        partner.setName("Dit navn");
        partner.setEmail("dit_email@eksempel.dk");
        partner.setAddress("Dit adresse");
        partner.setOpeningHours("Dine  opening hours");
        partner.setWhoIs("Din beskrivelse");
        partner.setSinceWhen("Din start dato");
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        model.addAttribute("partners", partners);
        return "private";
    }

    @GetMapping("/partner/{id}")
    public String partnerPage() {
        // TODO Update to a page about the partner
        return "partner";
    }
}
