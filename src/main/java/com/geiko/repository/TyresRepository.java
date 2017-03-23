package com.geiko.repository;

import com.geiko.model.Tyres;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Repository
public class TyresRepository {

    private final SessionFactory sessionFactory;

    public TyresRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Tyres findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Tyres.class, id);
    }

    public List<Tyres> findAll(){
        Session session = sessionFactory.openSession();
        return session.createCriteria(Tyres.class).list();
    }
    public void save(Tyres tyres){
        Session session = sessionFactory.openSession();
        session.save(tyres);
    }

}
