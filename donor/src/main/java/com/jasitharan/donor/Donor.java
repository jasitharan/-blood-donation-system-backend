package com.jasitharan.donor;

import javax.persistence.*;
import java.util.Date;

@Table(name="donor")
@Entity
public class Donor {
    @Id
    private String id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donor_id")
    private int donor_id;

    @Column(name= "national_id")
    private String national_id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private char gender;

    @Column(name = "address")
    private String address;

    @Column(name = "district")
    private String district;

    @Column(name = "telephone_number")
    private String telephone_number;

    @Column(name = "blood_group")
    private String blood_group;

    @Column(name = "last_donation_date")
    private Date last_donation_date;

    @Column(name = "weight")
    private float weight;

    @Column(name = "hemoglobin_level")
    private float hemoglobin_level;

    public Donor(int donor_id, String national_id, String name, Date dob, char gender, String address, String district, String telephone_number, String blood_group, Date last_donation_date, float weight, float hemoglobin_level) {
        this.donor_id = donor_id;
        this.national_id = national_id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.district = district;
        this.telephone_number = telephone_number;
        this.blood_group = blood_group;
        this.last_donation_date = last_donation_date;
        this.weight = weight;
        this.hemoglobin_level = hemoglobin_level;
    }

    public Donor(){ }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getDonor_id() {
        return donor_id;
    }

    public void setDonor_id(int donor_id) {
        this.donor_id = donor_id;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public Date getLast_donation_date() {
        return last_donation_date;
    }

    public void setLast_donation_date(Date last_donation_date) {
        this.last_donation_date = last_donation_date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHemoglobin_level() {
        return hemoglobin_level;
    }

    public void setHemoglobin_level(float hemoglobin_level) {
        this.hemoglobin_level = hemoglobin_level;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "donor_id=" + donor_id +
                ", national_id='" + national_id + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", telephone_number='" + telephone_number + '\'' +
                ", blood_group='" + blood_group + '\'' +
                ", last_donation_date=" + last_donation_date +
                ", weight=" + weight +
                ", hemoglobin_level=" + hemoglobin_level +
                '}';
    }
}
