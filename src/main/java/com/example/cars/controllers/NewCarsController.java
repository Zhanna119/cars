package com.example.cars.controllers;

import com.example.cars.entity.CarColor;
import com.example.cars.entity.NewCars;
import com.example.cars.enums.Gearbox;
import com.example.cars.repository.NewCarsRepository;
import com.example.cars.service.NewCarsService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NewCarsController {
    private final NewCarsService newCarsService;
    public NewCarsController(NewCarsService newCarsService, NewCarsRepository newCarsRepository) {
        this.newCarsService = newCarsService;
        this.newCarsRepository = newCarsRepository;
    }

    private final NewCarsRepository newCarsRepository;

    @GetMapping("newCars")
    String allNewCars(Model model) {
        return "newCars";
    }


    /*@GetMapping("/allNewCars")
    String getNewCars(Model model) {
        Iterable<NewCars> newCarsList = newCarsRepository.findAll();
        newCarsRepository.findByPrice(200000);
        newCarsRepository.findById(1l);
        newCarsRepository.findByGearbox(Gearbox.AUTOMATIC);
        newCarsRepository.findByBodyType("Sedan");
        newCarsRepository.findAll();
        model.addAttribute("newCarsList", newCarsList);
        return "allNewCars";
    }*/

    @GetMapping("allNewCars1")
    List<NewCars> getAllNewCars() {
        List<NewCars> allNewCarsList = newCarsRepository.findAll();
        //model.addAttribute("allNewCarsList", allNewCarsList);
        return allNewCarsList;
    }

}