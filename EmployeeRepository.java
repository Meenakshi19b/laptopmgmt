package com.example.LaptopManagement.repository;
import com.example.LaptopManagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository provides all basic CRUD methods
    // Custom query methods can be added here if needed
}