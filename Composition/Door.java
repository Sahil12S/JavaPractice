package sahil12;

public class Door {
    private Dimension dimension;
    private String color;
    private String material;

    public Door(Dimension dimension, String color, String material) {
        this.dimension = dimension;
        this.color = color;
        this.material = material;
    }

    public void closeDoor() {
        System.out.println("Door is now closed.");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
