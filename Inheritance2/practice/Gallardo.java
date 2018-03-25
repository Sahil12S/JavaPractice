package practice;

public class Gallardo extends Car{

    private int mileage;

    public Gallardo(int mileage) {
        super("Gallardo", "Rear wheel drive", 4, 2, 6, true);
        this.mileage = mileage;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0) {
            Stop();
            changeGear(0);
        } else if(newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity <= 25) {
            changeGear(2);
        } else if(newVelocity <= 45) {
            changeGear(3);
        } else if(newVelocity <= 80) {
            changeGear(4);
        } else if(newVelocity <= 120) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
