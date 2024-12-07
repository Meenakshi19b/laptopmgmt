package com.example.LaptopManagement.service;
import com.example.LaptopManagement.models.Assignment;
import com.example.LaptopManagement.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public Assignment assignLaptop(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }
}
