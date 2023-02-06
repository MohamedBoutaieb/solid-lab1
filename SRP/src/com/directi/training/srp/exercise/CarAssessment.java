package com.directi.training.srp.exercise;

import java.util.List;

public class CarAssessment {
    private List<Car> cars;

    public CarAssessment(List<Car> cars) {
        this.cars = cars;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
