package com.jasitharan.donation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService{

    @Autowired
    private DonationRepository donationRepository;

    public void save(Donation donation){
        donationRepository.save(donation);
    }


    public List<Donation> getAll(){
        return (List<Donation>) donationRepository.findAll();
    }


    public void delete(String id){
        donationRepository.deleteById(id);
    }

}
