package com.adamcurzon.learning.spring.service;

import com.adamcurzon.learning.spring.model.Car;
import com.adamcurzon.learning.spring.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> all() {
        return carRepository.findAll();
    }

    public Car save(Car user) {
        return carRepository.save(user);
    }

    public Optional<Car> get(int id) {
        return carRepository.findById((long) id);
    }
}
