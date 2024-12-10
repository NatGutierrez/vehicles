package entities.factory;

import entities.factory.base.VehicleFactory;
import entities.vehicles.Bicycle;
import entities.vehicles.Vehicle;

public class BicycleFactory extends VehicleFactory {

    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
