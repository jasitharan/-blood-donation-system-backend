package com.jasitharan.donation;

import javax.persistence.*;

@Table(name="donation")
@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private int donation_id;

    @Column(name = "donor_id")
    private int donor_id;

    @Column(name = "campaign_id")
    private int campaign_id;

    @Column(name = "donor_condition")
    private String donor_condition;

    @Column(name = "blood_status")
    private char blood_status;

    public Donation(int donation_id, int donor_id, int campaign_id, String donor_condition, char blood_status) {
        this.donation_id = donation_id;
        this.donor_id = donor_id;
        this.campaign_id = campaign_id;
        this.donor_condition = donor_condition;
        this.blood_status = blood_status;
    }

    public Donation(){ }

    public int getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(int donation_id) {
        this.donation_id = donation_id;
    }

    public int getDonor_id() {
        return donor_id;
    }

    public void setDonor_id(int donor_id) {
        this.donor_id = donor_id;
    }

    public int getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(int campaign_id) {
        this.campaign_id = campaign_id;
    }

    public String getDonor_condition() {
        return donor_condition;
    }

    public void setDonor_condition(String donor_condition) {
        this.donor_condition = donor_condition;
    }

    public char getBlood_status() {
        return blood_status;
    }

    public void setBlood_status(char blood_status) {
        this.blood_status = blood_status;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donation_id=" + donation_id +
                ", donor_id=" + donor_id +
                ", campaign_id=" + campaign_id +
                ", donor_condition='" + donor_condition + '\'' +
                ", blood_status=" + blood_status +
                '}';
    }
}
