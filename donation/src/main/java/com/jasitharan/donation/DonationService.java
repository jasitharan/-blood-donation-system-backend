package com.jasitharan.donation;


import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService{

    @Autowired
    private DonationRepository donationRepository;
    private final WebClient.Builder webClientBuilder;


    public void save(Donation donation){
        try {
            String result = webClientBuilder.build().get()
                    .uri("http://localhost:8080/campaigns/incrementDonationCount/" + donation.getCampaign_id())
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            System.out.println(result);
            donationRepository.save(donation);
        } catch (ResourceNotFoundException e) {
             throw new ResourceNotFoundException
                     ("donation not found");
        }


    }


    public List<Donation> getAll(){
        return (List<Donation>) donationRepository.findAll();
    }


    public void delete(String id){
        donationRepository.deleteById(id);
    }

}
