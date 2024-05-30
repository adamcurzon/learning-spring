package com.adamcurzon.learning.spring.repository;

import com.adamcurzon.learning.spring.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
