package com.pro.traini8_mvp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.pro.traini8_mvp.model.TrainingCenter;
import com.pro.traini8_mvp.repository.TrainingCenterRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingCenterService {
    private final TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter center) {
        center.setCreatedOn(System.currentTimeMillis());
        return repository.save(center);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
