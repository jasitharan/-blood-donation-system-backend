package com.jasitharan.donation;


import lombok.RequiredArgsConstructor;
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
        webClientBuilder.build().post()
                .uri("/employees")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body("", String.class)
                .retrieve()
                .bodyToMono(String.class);
        donationRepository.save(donation);
    }


    public List<Donation> getAll(){
        return (List<Donation>) donationRepository.findAll();
    }


    public void delete(String id){
        donationRepository.deleteById(id);
    }

}
