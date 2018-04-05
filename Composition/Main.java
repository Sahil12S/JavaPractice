package sahil12;

public class Main {
    public static void main(String args[]) {
        Dimension roomDimension = new Dimension(25, 20, 15);
        Dimension windowDimension = new Dimension(5, 2, 6);
        Dimension doorDimension = new Dimension(4, 1, 7);
        Dimension bedDimension = new Dimension(7, 5, 2);

        Window newWindow = new Window(windowDimension, "North", "Slide");
        Door newDoor = new Door(doorDimension, "Brown", "Wood");
        Floor newFloor = new Floor("Wood", 25, 20);
        Bed newBed = new Bed(bedDimension, "King", "Black", "Wood", "White", 2);

        Room newRoom = new Room(roomDimension,"Sky Blue", newWindow, newDoor, newBed, newFloor);

        newRoom.floorArea();
        newRoom.makeRoom();
        newRoom.getBed().readyBed();
    }

}
