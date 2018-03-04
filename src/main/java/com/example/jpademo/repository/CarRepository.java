package com.example.jpademo.repository;

import com.example.jpademo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {


}
