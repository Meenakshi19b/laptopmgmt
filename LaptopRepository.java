package com.example.LaptopManagement.repository;
import com.example.LaptopManagement.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    // JpaRepository provides all basic CRUD methods
    // Custom query methods can be added here if needed
}