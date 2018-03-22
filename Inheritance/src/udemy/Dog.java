package udemy;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing his food.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating food.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking.");
        super.move(6);
//        Look at the difference when you use move() instead of super.move().
    }

    public void run() {
        System.out.println("Dog is running.");
        move(16);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog is moving legs at speed " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("");
        super.move(speed);
    }
}
