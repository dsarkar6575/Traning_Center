package com.pro.traini8_mvp.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pro.traini8_mvp.model.TrainingCenter;
import com.pro.traini8_mvp.service.TrainingCenterService;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@RequiredArgsConstructor
public class TrainingCenterController {
    private final TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
        TrainingCenter savedCenter = service.saveTrainingCenter(center);
        return ResponseEntity.ok(savedCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}
