package org.example;

import org.example.BonusExercise.CarInspectionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void has4Tires_ReturnTrue_whenCarHas4Tires(){
        Car car = new Car(4, 5, true, true);
        boolean expected = true;
        boolean actual = CarInspectionService.has4Tires(car);
        assertEquals(actual,expected);
    }
    @Test
    void has4Tires_ReturnFalse_whenCarHas5Tires(){
        Car car = new Car(5, 5, true, true);
        boolean expected = false;
        boolean actual = CarInspectionService.has4Tires(car);
        assertEquals(actual,expected);
    }
    @Test
    void hasASeatBelt_returnsTrue_WhenCarHasSeatbelt(){
        Car car = new Car(4, 5, true, true);
        boolean expected = true;
        boolean actual = CarInspectionService.hasSeatBelt(car);
        assertEquals(actual,expected);
    }
    @Test
    void hasASeatBelt_returnsFalse_WhenCarHasNoSeatbelt(){
        Car car = new Car(4, 5, false, true);
        boolean expected = false;
        boolean actual = CarInspectionService.hasSeatBelt(car);
        assertEquals(actual,expected);
    }
    @Test
    void hasAirbag_returnsTrue_WhenCarHasAirbag(){
        Car car = new Car(4, 5, true, true);
        boolean expected = true;
        boolean actual = CarInspectionService.hasAirbag(car);
        assertEquals(actual,expected);
    }
    @Test
    void hasAirbag_returnsFalse_WhenCarHasNoAirbag(){
        Car car = new Car(4, 5, false, false);
        boolean expected = false;
        boolean actual = CarInspectionService.hasAirbag(car);
        assertEquals(actual,expected);
    }
    @Test
    void hasCorrectAmountOfDoors_returnsTrue_WhenCarHas5Doors(){
        Car car = new Car(4, 5, true, true);
        boolean expected = true;
        boolean actual = CarInspectionService.hasCorrectAmountOfDoors(car, 5);
        assertEquals(actual,expected);
    }
    @Test
    void hasCorrectAmountOfDoors_returnsFalse_WhenCarHas2Doors(){
        Car car = new Car(4, 2, true, true);
        boolean expected = false;
        boolean actual = CarInspectionService.hasCorrectAmountOfDoors(car, 5);
        assertEquals(actual,expected);
    }
    @Test
    void isValidCar_returnsTrue_WhenAllChecksArePassed(){
        Car car = new Car(4, 3, true, true);
        boolean expected = true;
        boolean actual = CarInspectionService.isValidCar(car);
        assertEquals(actual,expected);
    }
    @Test
    void isValidCar_returnsFalse_WhenCarHas2Doors(){
        Car car = new Car(4, 2, true, true);
        boolean expected = false;
        boolean actual = CarInspectionService.isValidCar(car);
        assertEquals(actual,expected);
    }

}