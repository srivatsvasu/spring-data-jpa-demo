package com.example.jpademo.service;

import com.example.jpademo.domain.Car;
import com.example.jpademo.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car getCar(Long id) {
        return carRepository.getOne(id);
    }
}
