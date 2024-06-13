package com.example.demo.controller;

import com.example.demo.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    @Autowired
    private OpenAIService openAIService;

    @GetMapping("/estimate")
    public String getEstimate(@RequestParam String prompt) {
        try {
            return openAIService.getPrediction(prompt);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
