package entities.vehicles;

import services.MotorcycleService;
import services.MotorcycleServiceImp;

public class Motorcycle implements Vehicle {
    private Integer gearNumber;
    private Integer cylinderCapacity;
    private final MotorcycleService motorcycleService;

    public Motorcycle(){
        this.motorcycleService = new MotorcycleServiceImp();
    }

    public Motorcycle(Integer gearNumber, Integer cylinderCapacity) {
        this();
        this.gearNumber = gearNumber;
        this.cylinderCapacity = cylinderCapacity;
    }

    public void start(){
        this.motorcycleService.start();
    }

    public void turnOff(){
        this.motorcycleService.turnOff();
    }

    public void goForward() {
        System.out.println("Motorcycle going Forward");
    }

    public void goBackward() {
        System.out.println("Human going Backward");
    }

    public void brake() {
        System.out.println("Motorcycle braking");
    }

    public Integer getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(Integer gearNumber) {
        this.gearNumber = gearNumber;
    }

    public Integer getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(Integer cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "gearNumber=" + gearNumber +
                ", cylinderCapacity=" + cylinderCapacity +
                '}';
    }
}
