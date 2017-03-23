package com.geiko.model;

import javax.persistence.*;

/**
 * Created by Андрей on 22.03.2017.
 */
@Entity
@Table(name = "wheel")
public class Wheel {
    private int id;
    private Car car;
    private Tyres tyres;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "car_id")
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tyres_id")
    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "id=" + id +
                ", tyres=" + tyres +
                '}';
    }
}
