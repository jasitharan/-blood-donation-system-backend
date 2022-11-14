package com.jasitharan.campaign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService{

    @Autowired
    private  CampaignRepository campaignRepository;


    public  ResponseEntity<Campaign> update(Integer id)
    {
        Campaign findedCampaign = campaignRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("campaign not exists with this id :" + id));


           findedCampaign.setDonation_count(findedCampaign.getDonation_count() + 1);
           campaignRepository.save(findedCampaign);
           return ResponseEntity.ok(findedCampaign);

    }
    public Campaign saveCampaign(Campaign campaign){

        campaignRepository.save(campaign);
        return campaign;
    }


    public List<Campaign> getAll(){
        return (List<Campaign>) campaignRepository.findAll();
    }

    public void delete(@PathVariable Integer id){
        campaignRepository.deleteById(id);
    }


}