package sahil12;

public class Window {
    private Dimension dimension;
    private String direction;
    private String type;

    public Window(Dimension dimension, String direction, String type) {
        this.dimension = dimension;
        this.direction = direction;
        this.type = type;
    }

    public void openWindow() {
        System.out.println("Window is now open");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getDirection() {
        return direction;
    }

    public String getType() {
        return type;
    }
}
