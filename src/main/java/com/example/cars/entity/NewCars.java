package com.example.cars.entity;

import com.example.cars.enums.Gearbox;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
