package com.jasitharan.campaign;


import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Table(name="campaign")
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private int campaign_id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "status")
    private char status;

    public Campaign(int campaign_id, String name, String location, Date date, LocalTime time, char status) {
        this.campaign_id = campaign_id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    public Campaign(){ }
    public int getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(int campaign_id) {
        this.campaign_id = campaign_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "campaign_id=" + campaign_id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", status=" + status +
                '}';
    }
}
