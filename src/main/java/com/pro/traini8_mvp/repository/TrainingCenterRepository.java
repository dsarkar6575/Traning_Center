package com.pro.traini8_mvp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.pro.traini8_mvp.model.TrainingCenter;

public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
}
