package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private CarsDB carDb = new CarsDB();
    private List<Car> carList = carDb.getAllCars();
    private CarAssessment carAssessment = new CarAssessment(carList);
    private CarNamesList carNamesList = new CarNamesList(carList);

    public Car getFromDb(final String carId) {

        return carDb.getCar(carId);
    }

    public String getCarsNames() {
        return carNamesList.getCarsNames();
    }

    public Car getBestCar() {
        return carAssessment.getBestCar();
    }
}
