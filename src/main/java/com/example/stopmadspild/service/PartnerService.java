package com.example.stopmadspild.service;

import com.example.stopmadspild.model.Partner;
import com.example.stopmadspild.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartnerService {
    @Autowired
    PartnerRepository partnerRepository;

    public Partner savePartner(Partner partner) {
        partnerRepository.save(partner);
        return partner;
    }

    public Partner updatePartner(Partner partner) {
        partnerRepository.update(partner);
        return partner;
    }

    public boolean deletePartner(int id) {
        return partnerRepository.deleteById(id) > 0;
    }

    public Optional<Partner> getPartnerById(int id) {
        return partnerRepository.findById(id);
    }

    public List<Partner> getAllPartners() {
        return partnerRepository.findAll();
    }
}
