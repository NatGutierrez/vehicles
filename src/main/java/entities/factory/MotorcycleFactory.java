package entities.factory;

import entities.factory.base.VehicleFactory;
import entities.vehicles.Motorcycle;
import entities.vehicles.Vehicle;

public class MotorcycleFactory extends VehicleFactory {

    public Vehicle createVehicle(){
        return new Motorcycle();
    }
}
