package org.example;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startEngine();
        Car car2 = new Car();
        car2.speedUp();
        System.out.println("Car 2 speed is: " + car2.getSpeed());

        Person person1 = new Person("Lisa", 24, "She/her");

        System.out.println(person1.presentPerson());
    }
}