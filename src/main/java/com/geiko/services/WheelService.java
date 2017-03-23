package com.geiko.services;

import com.geiko.model.Car;
import com.geiko.model.Wheel;
import com.geiko.repository.WheelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Service
@Transactional
public class WheelService {

    @Autowired
    WheelRepository wheelRepository;

    public List<Wheel> findAll(){return wheelRepository.findAll();}

    public Wheel findById(int id){
        return wheelRepository.findById(id);
    }

    public void save(Wheel wheel){
        wheelRepository.save(wheel);
    }
}
