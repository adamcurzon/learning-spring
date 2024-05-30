package com.adamcurzon.learning.spring.controller;

import com.adamcurzon.learning.spring.service.CarService;
import com.adamcurzon.learning.spring.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping
    public List<Car> index(){
        return carService.all();
    }

    @GetMapping("/{id}")
    public Car get(@PathVariable int id){
        Optional<Car> car = carService.get(id);

        if(car.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return car.get();
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.save(car);
    }
}
