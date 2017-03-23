package com.geiko.model;

import javax.persistence.*;

/**
 * Created by Андрей on 22.03.2017.
 */
@Entity
@Table(name= "engine")
public class Engine {
    private int id;
    private int engineCapacity;
    private Car car;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "engine_capacity")
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
