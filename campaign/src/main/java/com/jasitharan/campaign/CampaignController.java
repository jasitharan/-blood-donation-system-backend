package com.jasitharan.campaign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    @Autowired(required=true)
    private CampaignService campaignService;

    @PostMapping("/addCampaign")
    public ResponseEntity<Campaign> addCampaign(@RequestBody Campaign campaign) {
        Campaign campaign1;
        try {
            campaign1=campaignService.saveCampaign(campaign);
            return new ResponseEntity<Campaign>(campaign1, HttpStatus.OK);

        } catch (Exception ex) {
            return null;
        }
    }

    @GetMapping("/getCampaign")
    public List<Campaign> getAllCampaigns(){
        return campaignService.getAll();
    }

    @PutMapping("/updateCampaign")
   private Campaign update(@RequestBody Campaign campaign)
    {
        campaignService.update(campaign);
        return  campaign;
    }
    @DeleteMapping("deleteCampaign/{id}")
    public void deleteCampaign(@PathVariable String id){
        campaignService.delete(id);
    }

}
