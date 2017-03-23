package com.geiko.services;

import com.geiko.model.Engine;
import com.geiko.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Service
@Transactional
public class EngineService {

    @Autowired
    EngineRepository engineRepository;

    public Engine findById(int id) {
        return engineRepository.findById(id);
    }

    public List<Engine> findAll(){
        return engineRepository.findAll();
    }
    public void save(Engine engine){
        engineRepository.save(engine);
    }
}
