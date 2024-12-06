package entities;

public abstract class Vehicle {
    private Integer maxSpeed;
    private Integer seats;
    private String color;
    private Boolean heavy;

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void brake();

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Boolean getHeavy() {
        return heavy;
    }

    public void setHeavy(Boolean heavy) {
        this.heavy = heavy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
