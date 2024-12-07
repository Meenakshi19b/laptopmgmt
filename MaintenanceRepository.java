package com.example.LaptopManagement.repository;
import com.example.LaptopManagement.models.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
    // JpaRepository provides all basic CRUD methods
    // Custom query methods can be added here if needed
}