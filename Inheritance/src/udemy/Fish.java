package udemy;

public class Fish extends Animal{

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest() {
        System.out.println("Fish is taking rest.");
    }

    private void moveMuscle() {
        System.out.println("Fish is moving muscle.");
    }

    private void moveBackFin() {
        System.out.println("Fish is moving back fin.");
    }

    private void swim(int speed) {
        System.out.println("Fish is swimming.");
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }
}
