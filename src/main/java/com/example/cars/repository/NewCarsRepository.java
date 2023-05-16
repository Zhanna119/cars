package com.example.cars.repository;

import com.example.cars.entity.NewCars;
import com.example.cars.enums.Gearbox;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;;

@Repository
public interface NewCarsRepository extends JpaRepository<NewCars, Long> {
    List<NewCars> findByPrice(long price);
    List<NewCars> findByBodyType(String bodyType);
    List<NewCars> findByYearAndBodyType(int year, String bodyType);
    List<NewCars> findByGearbox(Gearbox gearbox);
    List<NewCars> findByFuelTypeOrBodyTypeOrGearbox(String fuelType, String bodyType, Gearbox gearbox);

    List<NewCars> findAll();

}
