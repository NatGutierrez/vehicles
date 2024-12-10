package entities.factory;

import entities.factory.base.VehicleFactory;
import entities.vehicles.Car;
import entities.vehicles.Vehicle;

public class CarFactory extends VehicleFactory {

    public Vehicle createVehicle() {
        return new Car();
    }
}
