package com.jasitharan.donation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping("/addDonation")
    public void addDonation(@RequestBody Donation donation){
        donationService.save(donation);
    }

    @GetMapping("/getDonations")
    public List<Donation> getAllDonations(){
        return donationService.getAll();
    }

    @DeleteMapping("/deleteDonation/{id}")
    public void deleteDonations(@PathVariable String id){
        donationService.delete(id);
    }

}