package j3e.divani.services;

import j3e.divani.model.dtos.CarResult;
import j3e.divani.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<CarResult> getAllCars(){
        return carRepository.findAll()
                .stream()
                .map(CarResult::from)
                .collect(Collectors.toList());
    }
}
