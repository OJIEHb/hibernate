package com.geiko.services;

import com.geiko.model.Tyres;
import com.geiko.repository.TyresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Service
@Transactional
public class TyresService {

    @Autowired
    TyresRepository tyresRepository;
    public Tyres findById(int id) {
        return tyresRepository.findById(id);
    }

    public List<Tyres> findAll(){
        return tyresRepository.findAll();
    }
    public void save(Tyres tyres){
        tyresRepository.save(tyres);
    }
}
