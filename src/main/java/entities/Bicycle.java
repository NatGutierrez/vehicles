package entities;

public class Bicycle extends Vehicle {

    private Boolean trainingWheels;

    public Bicycle(Boolean trainingWheels) {
        this.trainingWheels = trainingWheels;
    }

    public void goForward() {
        System.out.println("Bicycle pedalling");
    }

    public void goBackward() {
        System.out.println("Human walking backwards");
    }

    public void brake() {
        System.out.println("Bicycle braking");
    }

    public Boolean getTrainingWheels() {
        return trainingWheels;
    }

    public void setTrainingWheels(Boolean trainingWheels) {
        this.trainingWheels = trainingWheels;
    }
}
