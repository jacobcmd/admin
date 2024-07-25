package j3e.divani.utils;

import j3e.divani.model.entities.Car;
import j3e.divani.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Loading data...");
        carRepository.saveAll(getCarList());

        log.info("Data loaded");
    }

    private List<Car> getCarList() {
        var car1 = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .year(1967)
                .build();
        var car2 = Car.builder()
                .brand("Ferrary")
                .model("Spider")
                .year(1983)
                .build();
        var car3 = Car.builder()
                .brand("Lamborgini")
                .model("Aventador")
                .year(2010)
                .build();
        var car4 = Car.builder()
                .brand("Audi")
                .model("A4")
                .year(2023)
                .build();
        return List.of(car1,car2,car3,car4);
    }

}
