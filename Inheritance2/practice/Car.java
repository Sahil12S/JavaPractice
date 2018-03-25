package practice;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    boolean isAutomatic;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isAutomatic) {
        super(name, size);

        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isAutomatic = isAutomatic;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Gear is changed to " + this.currentGear + ".");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity: Velocity " + speed + " in direction " + direction);
        move(speed, direction);
    }
}
