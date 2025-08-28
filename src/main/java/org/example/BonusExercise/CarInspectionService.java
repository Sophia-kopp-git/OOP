package org.example.BonusExercise;

import org.example.Car;

public class CarInspectionService {

    public static boolean has4Tires(Car car) {
        int numberOfTires = car.getNumberOfTires();
        return numberOfTires == 4;
    }

    public static boolean hasSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    public static boolean hasAirbag(Car car) {
        return car.isAirbag();
    }

    public static boolean hasCorrectAmountOfDoors(Car car, int doors) {
        return doors == car.getNumberOfDoors();
    }

    public static boolean isValidCar(Car car) {

        return has4Tires(car) &&
                hasAirbag(car) &&
                hasSeatBelt(car) &&
                (hasCorrectAmountOfDoors(car, 3) || hasCorrectAmountOfDoors(car, 5));
    }
}
