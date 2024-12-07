package com.example.LaptopManagement.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "laptop_id", nullable = false)
    private Laptop laptop;

    private String description;
    private String status;

    private Double cost;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loggedAt;

    // Constructors
    public Maintenance() {
    }

    public Maintenance(Laptop laptop, String description, String status, Double cost, Date loggedAt) {
        this.laptop = laptop;
        this.description = description;
        this.status = status;
        this.cost = cost;
        this.loggedAt = loggedAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getLoggedAt() {
        return loggedAt;
    }

    public void setLoggedAt(Date loggedAt) {
        this.loggedAt = loggedAt;
    }
}
