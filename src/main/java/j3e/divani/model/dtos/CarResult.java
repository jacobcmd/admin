package j3e.divani.model.dtos;

import j3e.divani.model.entities.Car;

public record CarResult(Long id, String brand, String model, Integer year, String color) {
    public static CarResult from(Car car){
        return new CarResult(car.getId(),car.getBrand(), car.getModel(), car.getYear(),car.getColor());
    }
}
