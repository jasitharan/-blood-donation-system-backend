package com.jasitharan.campaign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CampaignService{

    @Autowired
    private  CampaignRepository campaignRepository;


    public  Campaign update(Campaign campaign)
    {
        campaignRepository.save(campaign);
        return campaign;
    }
    public Campaign saveCampaign(Campaign campaign){

        campaignRepository.save(campaign);
        return campaign;
    }


    public List<Campaign> getAll(){
        return (List<Campaign>) campaignRepository.findAll();
    }

    public void delete(@PathVariable String id){
        campaignRepository.deleteById(id);
    }


}