package com.jasitharan.donor;


import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, String> {
}
