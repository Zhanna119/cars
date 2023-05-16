package com.example.cars.entity;

import com.example.cars.enums.Gearbox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class NewCars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "carBrand_id")
    private CarBrand brand;

    @ManyToOne
    @JoinColumn(name = "carModel_id")
    private  CarModel model;

    @Enumerated(EnumType.STRING)
    private Gearbox gearbox; //коробка передач
    @ManyToOne
    @JoinColumn(name = "carColor_id")
    private CarColor color;
    private long price;
    private int year;
    @Column(name = "fuelType")
    private String fuelType;
    private String bodyType;

}
