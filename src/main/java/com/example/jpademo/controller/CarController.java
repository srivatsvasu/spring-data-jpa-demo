package com.example.jpademo.controller;

import com.example.jpademo.domain.Car;
import com.example.jpademo.service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    private Iterable<Car> getAllCars(){

        return carService.getAllCars();
    }


    @PostMapping("/")
    private Car saveCar(@RequestBody Car car){

        return carService.save(car);
    }


    @GetMapping("/{id}")
    private Car getCarById(@PathVariable Long id){
        return carService.getCar(id);
    }





}
