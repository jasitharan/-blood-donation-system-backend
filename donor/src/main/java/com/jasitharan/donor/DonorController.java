package com.jasitharan.donor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/donors")
public class DonorController {

    @Autowired(required = true)
    private DonorService donorService;


    @PostMapping("/addDonor")
    public ResponseEntity<Donor> addDonor(@RequestBody Donor donor) {
        Donor donor1;
        try {
            donor1=donorService.saveDonor(donor);
            return new ResponseEntity<Donor>(donor1, HttpStatus.OK);

        } catch (Exception ex) {
            return null;
        }
    }

    @GetMapping("/getDonors")
    public List<Donor> getAllDonors(){
        return donorService.getAll();
    }

    @PutMapping("/updateDonor/{id}")
    private Donor update(@RequestBody Donor donor,@PathVariable String id)
    {
        donorService.update(donor,id);
        return  donor;
    }

    @GetMapping("/deleteDonor/{id}")
    public Donor getDonor(@PathVariable String id){
        return donorService.getDonor(id);
    }

}
