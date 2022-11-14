package com.jasitharan.donor;


import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DonorService{

    @Autowired
    private DonorRepository donorRepository;

    public Donor saveDonor(Donor donor){

        donorRepository.save(donor);
        return donor;
    }

    public ResponseEntity<Donor> update(Donor donor, String id)
    {

        Donor findedDonor = donorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("donor not exists with this id :" + id));

        findedDonor.setAddress(donor.getAddress());
        findedDonor.setDistrict(donor.getDistrict());
        findedDonor.setTelephone_number(donor.getTelephone_number());
        findedDonor.setBlood_group(donor.getBlood_group());
        findedDonor.setLast_donation_date(donor.getLast_donation_date());
        findedDonor.setWeight(donor.getWeight());
        findedDonor.setHemoglobin_level(donor.getHemoglobin_level());

        Donor updatedDonor = donorRepository.save(findedDonor);



        return ResponseEntity.ok(updatedDonor);
    }

    public List<Donor> getAll(){
        return (List<Donor>) donorRepository.findAll();
    }

    public Donor getDonor(String id){
        return donorRepository.findById(id).get();
    }

}