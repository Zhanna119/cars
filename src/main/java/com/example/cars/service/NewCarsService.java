package com.example.cars.service;

import com.example.cars.repository.NewCarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewCarsService {

    private final NewCarsRepository newCarsRepository;

    @Autowired
    public NewCarsService(NewCarsRepository newCarsRepository) {
        this.newCarsRepository = newCarsRepository;
    }

}
