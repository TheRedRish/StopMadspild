package com.example.stopmadspild.controller;
import com.example.stopmadspild.model.Partner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PrivateUserController {

    // TODO move to company controller
    @GetMapping("/partner/{id}")
    public String partnerPage(Model model) {
        // TODO Replace with fetch of partner
        Partner partner = new Partner();
        partner.setName("Salling Group");
        partner.setEmail("dit_email@eksempel.dk");
        partner.setAddress("Dit adresse");
        partner.setOpeningHours("Dine  opening hours");

        partner.setWhoIs("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet nulla auctor, vestibulum magna sed, convallis ex. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed at mauris quis nisi consequat cursus. Nulla facilisi. In hac habitasse platea dictumst. Sed quis nulla eu tellus convallis convallis. Nullam et magna sit amet nunc sollicitudin malesuada. Sed eget risus sit amet nunc ultricies dictum. Sed vitae nunc eu nunc ultricies dictum. Sed sit amet nunc eu nunc ultricies dictum. Sed vitae nunc eu nunc ultricies dictum. Nulla facilisi. In hac habitasse platea dictumst. Sed quis nulla eu tellus convallis convallis. Nullam et magna sit amet nunc sollicitudin malesuada. Sed eget risus sit amet nunc ultricies dictum." +
                "Salling Group sælger dagligvarer og har en række forskellige butikker og kæder.\n" +
                "\n" +
                "Historien strækker sig mere end 100 år tilbage til 1906. Virksomheden har gennem årene udviklet sig markant, og det, der begyndte som en lille manufakturhandel i Aarhus, er i dag en international detailhandelskoncern. Butikker er kerneforretningen med flere end 1400 butikker i tre lande.\n" +
                "\n" +
                "Hovedkontoret ligger i Brabrand og ledes af administrerende direktør Per Bank. I Danmark har koncernen over 43.000 medarbejdere.");
        partner.setSinceWhen("Virksomheden har altid være optaget af madspild. Tidligere var driftsøkonomien omdrejningspunktet – altså at det koster penge at smide mad ud.\n" +
                "\n" +
                "Agendaen er gennem årene blevet lidt en anden og virksomheden har arbejdet strategisk med madspild siden 2014. Virksomheden har desuden rapporteret siden 2016.");
        partner.setHowMuch("Madspild opstår i hele værdikæden – indkøb, produktion, lager, transport og i butikken.\n" +
                "\n" +
                "På butiksniveau – er frugt og grønt det område, hvor der opstår mest madspild (næsten 50% af det samlede madspild). En anden stor kilde til madspild er det bagerbrød, som virksomheden selv producerer. Kort holdbarhed er en udslagsgivende faktor på disse produktkategorier.");
        partner.setIconPictureLink("https://onethird.dk/wp-content/uploads/2022/02/Salling.png");

        model.addAttribute("partner", partner);
        return "partner";
    }

    @GetMapping("/privateuser")
    public String index1(Model model){
        Partner partner = new Partner();
        partner.setName("Salling Group");
        partner.setEmail("dit_email@eksempel.dk");
        partner.setAddress("Dit adresse");
        partner.setOpeningHours("Dine opening hours");

        partner.setWhoIs("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet nulla auctor, vestibulum magna sed, convallis ex. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed at mauris quis nisi consequat cursus. Nulla facilisi. In hac habitasse platea dictumst. Sed quis nulla eu tellus convallis convallis. Nullam et magna sit amet nunc sollicitudin malesuada. Sed eget risus sit amet nunc ultricies dictum. Sed vitae nunc eu nunc ultricies dictum. Sed sit amet nunc eu nunc ultricies dictum. Sed vitae nunc eu nunc ultricies dictum. Nulla facilisi. In hac habitasse platea dictumst. Sed quis nulla eu tellus convallis convallis. Nullam et magna sit amet nunc sollicitudin malesuada. Sed eget risus sit amet nunc ultricies dictum." +
                "Salling Group sælger dagligvarer og har en række forskellige butikker og kæder.\n" +
                "\n" +
                "Historien strækker sig mere end 100 år tilbage til 1906. Virksomheden har gennem årene udviklet sig markant, og det, der begyndte som en lille manufakturhandel i Aarhus, er i dag en international detailhandelskoncern. Butikker er kerneforretningen med flere end 1400 butikker i tre lande.\n" +
                "\n" +
                "Hovedkontoret ligger i Brabrand og ledes af administrerende direktør Per Bank. I Danmark har koncernen over 43.000 medarbejdere.");
        partner.setSinceWhen("Virksomheden har altid være optaget af madspild. Tidligere var driftsøkonomien omdrejningspunktet – altså at det koster penge at smide mad ud.\n" +
                "\n" +
                "Agendaen er gennem årene blevet lidt en anden og virksomheden har arbejdet strategisk med madspild siden 2014. Virksomheden har desuden rapporteret siden 2016.");
        partner.setHowMuch("Madspild opstår i hele værdikæden – indkøb, produktion, lager, transport og i butikken.\n" +
                "\n" +
                "På butiksniveau – er frugt og grønt det område, hvor der opstår mest madspild (næsten 50% af det samlede madspild). En anden stor kilde til madspild er det bagerbrød, som virksomheden selv producerer. Kort holdbarhed er en udslagsgivende faktor på disse produktkategorier.");
        partner.setIconPictureLink("https://onethird.dk/wp-content/uploads/2022/02/Salling.png");

        List<Partner> partners = new ArrayList<>();
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        partners.add(partner);
        model.addAttribute("partners", partners);
        return "privateuser";
    }

    @PostMapping("/privateuser")
    public String index(){
        return "redirect:privateuser";
    }
}
