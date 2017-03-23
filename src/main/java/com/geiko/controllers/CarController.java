package com.geiko.controllers;

import com.geiko.model.Car;
import com.geiko.model.Engine;
import com.geiko.model.Tyres;
import com.geiko.model.Wheel;
import com.geiko.services.CarService;
import com.geiko.services.TyresService;
import com.geiko.services.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by Андрей on 22.03.2017.
 */
@Controller
public class CarController {

    @Autowired
    CarService carService;
    @Autowired
    TyresService tyresService;

    @RequestMapping("/")
    @ResponseBody
    public String save(){
        Car car = new Car();
        ArrayList<Wheel> wheels = new ArrayList<>();
        for(int i = 0; i <4;i++){
            Tyres tyres = new Tyres();
            tyres.setSize(17);
            tyres.setName("Test");
            Wheel wheel = new Wheel();
            wheel.setTyres(tyres);
            wheels.add(wheel);
        }
        Engine engine = new Engine();
        engine.setEngineCapacity(65);
        car.setName("Renault");
        car.setWheels(wheels);
        car.setEngine(engine);
        carService.save(car);
        return carService.findAll().toString();
    }
}
