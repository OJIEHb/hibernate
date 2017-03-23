package com.geiko.repository;

import com.geiko.model.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Repository
public class EngineRepository {

    private final SessionFactory sessionFactory;

    public EngineRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Engine findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Engine.class, id);
    }

    public List<Engine> findAll(){
        Session session = sessionFactory.openSession();
        return session.createCriteria(Engine.class).list();
    }
    public void save(Engine engine){
        Session session = sessionFactory.openSession();
        session.save(engine);
    }
}
