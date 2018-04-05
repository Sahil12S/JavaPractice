package sahil12;

public class Room {
    private Dimension dimension;
    private String color;
    private Window window;
    private Door door;
    private Bed bed;
    private Floor floor;

    public Room(Dimension dimension, String color, Window window, Door door, Bed bed, Floor floor) {
        this.dimension = dimension;
        this.color = color;
        this.window = window;
        this.door = door;
        this.bed = bed;
        this.floor = floor;
    }

    public void floorArea() {
        floor.getArea();
    }

    public void makeRoom() {
        window.openWindow();
        door.closeDoor();
    }

    public Bed getBed() {
        return bed;
    }

}
