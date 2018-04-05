package sahil12;

public class Floor {
    private String type;
    private int length;
    private int width;

    public Floor(String type, int length, int width) {
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        System.out.println("Area of room is: " + (length * width));
    }

}
