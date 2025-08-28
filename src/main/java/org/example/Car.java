package org.example;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed = 0;
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;

    public Car(int numberOfTires, int numberOfDoors,
               boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }

    public Car() {
    }

    public void startEngine() {
        System.out.println("Car started");
    }

    public int speedUp() {
        this.speed++;
        return this.speed;
    }

    public int slowDown() {
        this.speed--;
        return this.speed;
    }


    //getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }


    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && speed == car.speed && numberOfTires == car.numberOfTires && numberOfDoors == car.numberOfDoors && seatBelt == car.seatBelt && airbag == car.airbag && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfManufacture, speed, numberOfTires, numberOfDoors, seatBelt, airbag);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", speed=" + speed +
                ", numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }
}
