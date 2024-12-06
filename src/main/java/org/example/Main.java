package org.example;

import entities.Bicycle;
import entities.Car;
import entities.Motorcycle;
import entities.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle bicycle = new Bicycle(true);
        Motorcycle motorcycle = new Motorcycle(4, 100);
        Car car = new Car( Car.MotorType.GAS, 6);

        bicycle.goForward();
        bicycle.brake();
        bicycle.goBackward();

        System.out.println();
        motorcycle.start();
        motorcycle.goForward();
        motorcycle.brake();
        motorcycle.goBackward();
        motorcycle.turnOff();

        System.out.println();
        car.start();
        car.goForward();
        car.brake();
        car.goBackward();
        car.turnOff();

    }
}