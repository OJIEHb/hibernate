package com.geiko.services;

import com.geiko.model.Car;
import com.geiko.model.Wheel;
import com.geiko.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Service
@Transactional
public class CarService {

    @Autowired
    CarRepository carRepository;
    @Autowired
    WheelService wheelService;

    public Car findById(int id) {
        return carRepository.findById(id);
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public void save(Car car){
        carRepository.save(car);
    }
}
