package com.jasitharan.donation;


import com.jasitharan.campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, String> {
}
