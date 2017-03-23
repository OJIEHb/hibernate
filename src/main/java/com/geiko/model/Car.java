package com.geiko.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Андрей on 22.03.2017.
 */
@Entity
@Table(name = "car")
public class Car {
    private int id;
    private String name;
    private List<Wheel> wheels;
    private Engine engine;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "car",cascade =CascadeType.ALL)
    public List<Wheel> getWheels(){
        return wheels;
    }

    public void setWheels(List<Wheel> wheels){
        this.wheels = wheels;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="engine_id")
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }
}
