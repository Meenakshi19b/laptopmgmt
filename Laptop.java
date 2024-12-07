package com.example.LaptopManagement.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    private LaptopStatus status;

    @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    // Constructors
    public Laptop() {
    }

    public Laptop(String brand, String model, String serialNumber, LaptopStatus status, Date purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.status = status;
        this.purchaseDate = purchaseDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LaptopStatus getStatus() {
        return status;
    }

    public void setStatus(LaptopStatus status) {
        this.status = status;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
