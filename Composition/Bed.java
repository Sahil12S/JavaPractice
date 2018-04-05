package sahil12;

public class Bed {
    private Dimension dimension;
    private String type;
    private String color;
    private String material;
    private String sheetColor;
    private int countPillow;

    public Bed(Dimension dimension, String type, String color, String material, String sheetColor, int countPillow) {
        this.dimension = dimension;
        this.type = type;
        this.color = color;
        this.material = material;
        this.sheetColor = sheetColor;
        this.countPillow = countPillow;
    }

    public void readyBed() {
        System.out.println("Bed is ready with " + sheetColor + " sheet & " + countPillow + " pillows.");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public int getCountPillow() {
        return countPillow;
    }
}
