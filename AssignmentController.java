package com.example.LaptopManagement.controller;

import com.example.LaptopManagement.models.Assignment;
import com.example.LaptopManagement.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
@CrossOrigin
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }

    @PostMapping
    public Assignment assignLaptop(@RequestBody Assignment assignment) {
        return assignmentService.assignLaptop(assignment);
    }
}