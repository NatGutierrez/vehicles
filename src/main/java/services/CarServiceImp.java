package services;

public class CarServiceImp implements CarService {

    public void start() {
        System.out.println("Insert key");
        System.out.println("Turn key");
        System.out.println("Car on.");
    }

    public void turnOff() {
        System.out.println("Turn key");
        System.out.println("Car off.");
        System.out.println("Remove key");
    }
}
