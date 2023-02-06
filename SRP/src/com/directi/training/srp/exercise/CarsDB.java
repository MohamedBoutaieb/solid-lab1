package com.directi.training.srp.exercise;

import java.sql.Array;
import java.util.List;

public class CarsDB {
    private List<Car> _carsDb = Array
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public Car getCar(final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
    public List<Car> getAllCars(){
        return _carsDb;
    }
}
