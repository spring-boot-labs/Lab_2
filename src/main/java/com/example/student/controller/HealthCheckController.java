package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {
    
    // Railway sẽ check endpoint này
    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Student Management System");
        response.put("timestamp", java.time.Instant.now().toString());
        return response;
    }
    
    // Thêm endpoint /api/health để test
    @GetMapping("/api/health")
    public String apiHealth() {
        return "OK";
    }
    
    // Simple ping endpoint
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}