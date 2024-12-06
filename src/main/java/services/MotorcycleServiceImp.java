package services;

public class MotorcycleServiceImp implements MotorcycleService {

    public void start() {
        System.out.println("Insert key");
        System.out.println("Turn key");
        System.out.println("Press start button");
        System.out.println("Motorcycle on.");
    }

    public void turnOff() {
        System.out.println("Turn key");
        System.out.println("Motorcycle off.");
        System.out.println("Remove key");
    }
}
