package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager {
    private CarsDB carDb = new CarsDB();
    private CarAssessment carAssessment = new CarAssessment(carDb.getAllCars());

    public Car getFromDb(final String carId) {

        return carDb.getCar(carId);
    }

    public String getCarsNames() {
        return carAssessment.getCarsNames();
    }

    public Car getBestCar() {
        return carAssessment.getBestCar();
    }
}
