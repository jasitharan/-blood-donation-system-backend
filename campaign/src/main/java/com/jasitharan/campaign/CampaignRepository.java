package com.jasitharan.campaign;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface CampaignRepository extends MongoRepository<Campaign, String> {

}
