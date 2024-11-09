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
        partner.setName("Salling Group");
        partner.setEmail("dit_email@eksempel.dk");
        partner.setAddress("Dit adresse");
        partner.setOpeningHours("Dine  opening hours");
        partner.setWhoIs("Salling Group sælger dagligvarer og har en række forskellige butikker og kæder.\n" +
                "\n" +
                "Historien strækker sig mere end 100 år tilbage til 1906. Virksomheden har gennem årene udviklet sig markant, og det, der begyndte som en lille manufakturhandel i Aarhus, er i dag en international detailhandelskoncern. Butikker er kerneforretningen med flere end 1400 butikker i tre lande.\n" +
                "\n" +
                "Hovedkontoret ligger i Brabrand og ledes af administrerende direktør Per Bank. I Danmark har koncernen over 43.000 medarbejdere.");
        partner.setSinceWhen("Din start dato");
        partner.setIconPictureLink("https://onethird.dk/wp-content/uploads/2022/02/Salling.png");
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        model.addAttribute("partners", partners);
        return "partners";
    }

    @GetMapping("/partner/{id}")
    public String partnerPage() {
        // TODO Update to a page about the partner
        return "partner";
    }
}
