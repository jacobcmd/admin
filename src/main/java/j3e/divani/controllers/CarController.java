package j3e.divani.controllers;

import j3e.divani.model.dtos.CarResult;
import j3e.divani.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<CarResult> getAllCars(){
        return carService.getAllCars();
    }
}
