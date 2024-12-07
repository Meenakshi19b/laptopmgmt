package com.example.LaptopManagement.controller;
import com.example.LaptopManagement.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.LaptopManagement.models.Laptop;
import java.util.List;
@RestController
@RequestMapping("/api/laptops")
@CrossOrigin
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @PostMapping
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    @DeleteMapping("/{id}")
    public void deleteLaptop(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
    }
}
