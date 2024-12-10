package app;

import entities.factory.BicycleFactory;
import entities.factory.CarFactory;
import entities.factory.MotorcycleFactory;
import entities.factory.base.VehicleFactory;
import entities.vehicles.Bicycle;
import entities.vehicles.Car;
import entities.vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {

        VehicleFactory bicycleFactory = new BicycleFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        VehicleFactory carFactory = new CarFactory();

        Bicycle bicycle = (Bicycle) bicycleFactory.createVehicle();
        Motorcycle motorcycle = (Motorcycle) motorcycleFactory.createVehicle();
        Car car = (Car) carFactory.createVehicle();

        System.out.println();
        bicycle.setTrainingWheels(false);
        System.out.println(bicycle);
        bicycle.goForward();
        bicycle.brake();
        bicycle.goBackward();

        System.out.println();
        motorcycle.setGearNumber(5);
        motorcycle.setCylinderCapacity(125);
        System.out.println(motorcycle);
        motorcycle.start();
        motorcycle.goForward();
        motorcycle.brake();
        motorcycle.goBackward();
        motorcycle.turnOff();

        System.out.println();
        car.setGearNumber(6);
        car.setMotor(Car.MotorType.DIESEL);
        System.out.println(car);
        car.start();
        car.goForward();
        car.brake();
        car.goBackward();
        car.turnOff();

    }
}