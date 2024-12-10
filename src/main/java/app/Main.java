package app;

import entities.factory.BicycleFactory;
import entities.factory.CarFactory;
import entities.factory.MotorcycleFactory;
import entities.factory.base.VehicleFactory;
import entities.vehicles.Bicycle;
import entities.vehicles.Car;
import entities.vehicles.Motorcycle;

import java.util.HashMap;
import java.util.Map;

public class Main {
    enum FactoryType { CAR, BICYCLE, MOTORCYCLE }

    public static void main(String[] args) {

        Map<FactoryType, VehicleFactory> vehicleFactories = createFactories();

        Bicycle bicycle = (Bicycle) vehicleFactories.get(FactoryType.BICYCLE).createVehicle();
        Motorcycle motorcycle = (Motorcycle) vehicleFactories.get(FactoryType.MOTORCYCLE).createVehicle();
        Car car = (Car) vehicleFactories.get(FactoryType.CAR).createVehicle();

        doBicycleStuff(bicycle);

        doMotorcycleStuff(motorcycle);

        doCarStuff(car);

    }

    static Map<FactoryType, VehicleFactory> createFactories() {
        Map<FactoryType, VehicleFactory> factories = new HashMap<>();
        factories.put(FactoryType.BICYCLE, new BicycleFactory());
        factories.put(FactoryType.MOTORCYCLE, new MotorcycleFactory());
        factories.put(FactoryType.CAR, new CarFactory());

        return factories;
    }

    static void doBicycleStuff(Bicycle bicycle) {
        System.out.println();
        bicycle.setTrainingWheels(false);
        System.out.println(bicycle);
        bicycle.goForward();
        bicycle.brake();
        bicycle.goBackward();
    }

    static void doMotorcycleStuff(Motorcycle motorcycle) {
        System.out.println();
        motorcycle.setGearNumber(5);
        motorcycle.setCylinderCapacity(125);
        System.out.println(motorcycle);
        motorcycle.start();
        motorcycle.goForward();
        motorcycle.brake();
        motorcycle.goBackward();
        motorcycle.turnOff();
    }

    static void doCarStuff(Car car) {
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