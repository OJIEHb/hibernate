package com.geiko.repository;

import com.geiko.model.Car;
import com.geiko.model.Wheel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Андрей on 22.03.2017.
 */
@Repository
public class WheelRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public WheelRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Wheel findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Wheel.class, id);
    }

    public List<Wheel> findAll(){
        Session session = sessionFactory.openSession();
        return session.createCriteria(Wheel.class).list();
    }

    public void save(Wheel wheel){
        Session session = sessionFactory.openSession();
        session.save(wheel);
    }

}
