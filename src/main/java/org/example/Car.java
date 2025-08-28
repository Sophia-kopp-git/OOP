package org.example;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed = 0;

    public Car() {}

    public Car(String brand, String model, String color, int yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Car started");
    }
    public int speedUp(){
        this.speed++;
        return this.speed;
    }
    public int slowDown(){
        this.speed--;
        return this.speed;
    }

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
}
