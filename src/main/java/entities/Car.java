package entities;

import services.CarService;
import services.CarServiceImp;

public class Car extends Vehicle {
    public enum MotorType { GAS, DIESEL, ELECTRIC }
    private MotorType motor;
    private Integer gearNumber;
    private final CarService carService;

    public Car(MotorType motor, Integer gearNumber) {
        this.motor = motor;
        this.gearNumber = gearNumber;
        this.carService = new CarServiceImp();
    }

    public void start(){
        carService.start();
    }

    public void turnOff(){
        carService.turnOff();
    }

    public void goForward() {
        System.out.println("Car going Forward");
    }

    public void goBackward() {
        System.out.println("Car going Backward");
    }

    public void brake() {
        System.out.println("Car braking");
    }

    public MotorType getMotor() {
        return motor;
    }

    public void setMotor(MotorType motor) {
        this.motor = motor;
    }

    public Integer getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(Integer gearNumber) {
        this.gearNumber = gearNumber;
    }
}
